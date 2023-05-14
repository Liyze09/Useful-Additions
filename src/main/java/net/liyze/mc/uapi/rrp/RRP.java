package net.liyze.mc.uapi.rrp;

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

@SuppressWarnings("unused")
public class RRP implements ResourcePack {
    public static List<ResourcePack> rrps;
    public final int packVersion;
    public final Identifier identifier;
    private final Map<Identifier, Supplier<byte[]>> data = new ConcurrentHashMap<>();
    private final Map<Identifier, Supplier<byte[]>> assets = new ConcurrentHashMap<>();

    public RRP(int packVersion, Identifier identifier) {
        this.packVersion = packVersion;
        this.identifier = identifier;
    }

    public static RRP create(int packVersion, Identifier identifier) {
        RRP rrp = new RRP(packVersion, identifier);
        rrps.add(rrp);
        return rrp;
    }

    @Nullable
    @Override
    public InputStream openRoot(String fileName) {
        return null;
    }

    @Override
    public InputStream open(ResourceType type, Identifier id) {
        Supplier<byte[]> supplier = this.getSideMap(type).get(id);
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
        return this.getSideMap(type).containsKey(id);
    }

    @Override
    public Set<String> getNamespaces(ResourceType type) {
        Set<String> namespaces = new HashSet<>();
        for (Identifier identifier : this.getSideMap(type).keySet()) {
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

    public void addAsset(Identifier path, byte[] data) {
        this.assets.put(path, () -> data);
    }

    public void addData(Identifier path, byte[] data) {
        this.data.put(path, () -> data);
    }

    private Map<Identifier, Supplier<byte[]>> getSideMap(ResourceType side) {
        return side == ResourceType.CLIENT_RESOURCES ? this.assets : this.data;
    }
}