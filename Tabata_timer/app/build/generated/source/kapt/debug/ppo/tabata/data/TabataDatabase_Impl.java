package ppo.tabata.data;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class TabataDatabase_Impl extends TabataDatabase {
  private volatile TabataDAO _tabataDAO;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(2) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `TabataEntity` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `color` TEXT NOT NULL, `warm_up` INTEGER NOT NULL, `work` INTEGER NOT NULL, `rest` INTEGER NOT NULL, `repeats` INTEGER NOT NULL, `cycles` INTEGER NOT NULL, `cooldown` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '523c62b4f1399494461878abd7827407')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `TabataEntity`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsTabataEntity = new HashMap<String, TableInfo.Column>(9);
        _columnsTabataEntity.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTabataEntity.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTabataEntity.put("color", new TableInfo.Column("color", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTabataEntity.put("warm_up", new TableInfo.Column("warm_up", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTabataEntity.put("work", new TableInfo.Column("work", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTabataEntity.put("rest", new TableInfo.Column("rest", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTabataEntity.put("repeats", new TableInfo.Column("repeats", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTabataEntity.put("cycles", new TableInfo.Column("cycles", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTabataEntity.put("cooldown", new TableInfo.Column("cooldown", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTabataEntity = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTabataEntity = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTabataEntity = new TableInfo("TabataEntity", _columnsTabataEntity, _foreignKeysTabataEntity, _indicesTabataEntity);
        final TableInfo _existingTabataEntity = TableInfo.read(_db, "TabataEntity");
        if (! _infoTabataEntity.equals(_existingTabataEntity)) {
          return new RoomOpenHelper.ValidationResult(false, "TabataEntity(ppo.tabata.data.TabataEntity).\n"
                  + " Expected:\n" + _infoTabataEntity + "\n"
                  + " Found:\n" + _existingTabataEntity);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "523c62b4f1399494461878abd7827407", "b17b7e4018ed1caac30347ecb604fcc5");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "TabataEntity");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `TabataEntity`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public TabataDAO tabataDao() {
    if (_tabataDAO != null) {
      return _tabataDAO;
    } else {
      synchronized(this) {
        if(_tabataDAO == null) {
          _tabataDAO = new TabataDAO_Impl(this);
        }
        return _tabataDAO;
      }
    }
  }
}