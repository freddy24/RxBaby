package com.freddy.gogogo.gen;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.freddy.gogogo.data.entity.Code;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "CODE".
*/
public class CodeDao extends AbstractDao<Code, Long> {

    public static final String TABLENAME = "CODE";

    /**
     * Properties of entity Code.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, long.class, "id", true, "_id");
        public final static Property Number = new Property(1, String.class, "number", false, "NUMBER");
        public final static Property Animal = new Property(2, String.class, "animal", false, "ANIMAL");
        public final static Property Wave = new Property(3, String.class, "wave", false, "WAVE");
        public final static Property Bigsmall = new Property(4, String.class, "bigsmall", false, "BIGSMALL");
        public final static Property Doublesingle = new Property(5, String.class, "doublesingle", false, "DOUBLESINGLE");
    }


    public CodeDao(DaoConfig config) {
        super(config);
    }
    
    public CodeDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"CODE\" (" + //
                "\"_id\" INTEGER PRIMARY KEY NOT NULL ," + // 0: id
                "\"NUMBER\" TEXT NOT NULL ," + // 1: number
                "\"ANIMAL\" TEXT NOT NULL ," + // 2: animal
                "\"WAVE\" TEXT NOT NULL ," + // 3: wave
                "\"BIGSMALL\" TEXT NOT NULL ," + // 4: bigsmall
                "\"DOUBLESINGLE\" TEXT NOT NULL );"); // 5: doublesingle
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"CODE\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Code entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getId());
        stmt.bindString(2, entity.getNumber());
        stmt.bindString(3, entity.getAnimal());
        stmt.bindString(4, entity.getWave());
        stmt.bindString(5, entity.getBigsmall());
        stmt.bindString(6, entity.getDoublesingle());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Code entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getId());
        stmt.bindString(2, entity.getNumber());
        stmt.bindString(3, entity.getAnimal());
        stmt.bindString(4, entity.getWave());
        stmt.bindString(5, entity.getBigsmall());
        stmt.bindString(6, entity.getDoublesingle());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.getLong(offset + 0);
    }    

    @Override
    public Code readEntity(Cursor cursor, int offset) {
        Code entity = new Code( //
            cursor.getLong(offset + 0), // id
            cursor.getString(offset + 1), // number
            cursor.getString(offset + 2), // animal
            cursor.getString(offset + 3), // wave
            cursor.getString(offset + 4), // bigsmall
            cursor.getString(offset + 5) // doublesingle
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Code entity, int offset) {
        entity.setId(cursor.getLong(offset + 0));
        entity.setNumber(cursor.getString(offset + 1));
        entity.setAnimal(cursor.getString(offset + 2));
        entity.setWave(cursor.getString(offset + 3));
        entity.setBigsmall(cursor.getString(offset + 4));
        entity.setDoublesingle(cursor.getString(offset + 5));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Code entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Code entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Code entity) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
