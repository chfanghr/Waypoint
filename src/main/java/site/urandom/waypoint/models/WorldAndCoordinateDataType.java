package site.urandom.waypoint.models;

import org.apache.commons.lang.SerializationUtils;
import org.bukkit.persistence.PersistentDataAdapterContext;
import org.bukkit.persistence.PersistentDataType;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class WorldAndCoordinateDataType implements PersistentDataType<byte[], WorldAndCoordinate> {
    public static WorldAndCoordinateDataType getInstance() {
        return instance;
    }

    private static final WorldAndCoordinateDataType instance = new WorldAndCoordinateDataType();

    @Override
    public Class<byte[]> getPrimitiveType() {
        return byte[].class;
    }

    @Override
    public Class<WorldAndCoordinate> getComplexType() {
        return WorldAndCoordinate.class;
    }

    @Override
    public byte[] toPrimitive(WorldAndCoordinate complex, PersistentDataAdapterContext context) {
        return SerializationUtils.serialize(complex);
    }

    @Override
    public WorldAndCoordinate fromPrimitive(byte[] primitive, PersistentDataAdapterContext context) {
        try {
            InputStream is = new ByteArrayInputStream(primitive);
            ObjectInputStream ois = new ObjectInputStream(is);
            return (WorldAndCoordinate) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
