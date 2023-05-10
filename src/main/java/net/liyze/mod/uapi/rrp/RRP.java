package net.liyze.mod.uapi.rrp;

import com.google.gson.JsonObject;
import net.minecraft.resource.ResourcePack;
import net.minecraft.resource.ResourceType;
import net.minecraft.resource.metadata.ResourceMetadataReader;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class RRP implements ResourcePack {
    public static List<RRP> rrps = new ArrayList<>();
    public final int packVersion;
    public final Identifier identifier;
    private final Map<Identifier, Supplier<byte[]>> data = new ConcurrentHashMap<>();
    private final Map<Identifier, Supplier<byte[]>> assets = new ConcurrentHashMap<>();

    public RRP(int packVersion, Identifier identifier) {
        this.packVersion = packVersion;
        this.identifier = identifier;
    }

    @Nullable
    @Override
    public InputStream openRoot(String fileName) {
        return null;
    }

    @Override
    public InputStream open(ResourceType type, Identifier id) {
        Supplier<byte[]> supplier = this.getSys(type).get(id);
        if (supplier == null) {
            return null;
        }
        return new ByteArrayInputStream(supplier.get());
    }

    @Override
    public Collection<Identifier> findResources(ResourceType type, String namespace, String prefix, Predicate<Identifier> allowedPathPredicate) {
        return null;
    }

    @Override
    public boolean contains(ResourceType type, Identifier id) {
        return false;
    }

    @Override
    public Set<String> getNamespaces(ResourceType type) {
        Set<String> namespaces = new HashSet<>();
        for (Identifier identifier : this.getSys(type).keySet()) {
            namespaces.add(identifier.getNamespace());
        }
        return namespaces;
    }

    @Nullable
    @Override
    public <T> T parseMetadata(ResourceMetadataReader<T> metaReader) {
        JsonObject object = new JsonObject();
        object.addProperty("pack_format", this.packVersion);
        object.addProperty("description", "UAPI Runtime Resource Pack");
        return metaReader.fromJson(object);
    }

    @Override
    public String getName() {
        return "RRP" + this.identifier;
    }

    @Override
    public void close() {
    }

    public byte[] addResource(ResourceType type, Identifier path, byte[] data) {
        this.getSys(type).put(path, () -> data);
        return data;
    }

    private Map<Identifier, Supplier<byte[]>> getSys(ResourceType side) {
        return side == ResourceType.CLIENT_RESOURCES ? this.assets : this.data;
    }
}
