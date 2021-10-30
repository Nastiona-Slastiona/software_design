package ppo.tabata.data;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class TabataDAO_Impl implements TabataDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<TabataEntity> __insertionAdapterOfTabataEntity;

  private final EntityDeletionOrUpdateAdapter<TabataEntity> __deletionAdapterOfTabataEntity;

  private final EntityDeletionOrUpdateAdapter<TabataEntity> __updateAdapterOfTabataEntity;

  private final SharedSQLiteStatement __preparedStmtOfClear;

  public TabataDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTabataEntity = new EntityInsertionAdapter<TabataEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `TabataEntity` (`id`,`name`,`color`,`warm_up`,`work`,`rest`,`repeats`,`cycles`,`cooldown`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TabataEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getColor() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getColor());
        }
        stmt.bindLong(4, value.getWarm_up());
        stmt.bindLong(5, value.getWork());
        stmt.bindLong(6, value.getRest());
        stmt.bindLong(7, value.getRepeats());
        stmt.bindLong(8, value.getCycles());
        stmt.bindLong(9, value.getCooldown());
      }
    };
    this.__deletionAdapterOfTabataEntity = new EntityDeletionOrUpdateAdapter<TabataEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `TabataEntity` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TabataEntity value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfTabataEntity = new EntityDeletionOrUpdateAdapter<TabataEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `TabataEntity` SET `id` = ?,`name` = ?,`color` = ?,`warm_up` = ?,`work` = ?,`rest` = ?,`repeats` = ?,`cycles` = ?,`cooldown` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TabataEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getColor() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getColor());
        }
        stmt.bindLong(4, value.getWarm_up());
        stmt.bindLong(5, value.getWork());
        stmt.bindLong(6, value.getRest());
        stmt.bindLong(7, value.getRepeats());
        stmt.bindLong(8, value.getCycles());
        stmt.bindLong(9, value.getCooldown());
        stmt.bindLong(10, value.getId());
      }
    };
    this.__preparedStmtOfClear = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM TabataEntity";
        return _query;
      }
    };
  }

  @Override
  public void insertTabata(final TabataEntity tabata) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfTabataEntity.insert(tabata);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteTabata(final TabataEntity tabata) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfTabataEntity.handle(tabata);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateTabata(final TabataEntity tabata) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfTabataEntity.handle(tabata);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void clear() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfClear.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfClear.release(_stmt);
    }
  }

  @Override
  public LiveData<List<TabataEntity>> getTabatas() {
    final String _sql = "SELECT * FROM TabataEntity";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"TabataEntity"}, false, new Callable<List<TabataEntity>>() {
      @Override
      public List<TabataEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfColor = CursorUtil.getColumnIndexOrThrow(_cursor, "color");
          final int _cursorIndexOfWarmUp = CursorUtil.getColumnIndexOrThrow(_cursor, "warm_up");
          final int _cursorIndexOfWork = CursorUtil.getColumnIndexOrThrow(_cursor, "work");
          final int _cursorIndexOfRest = CursorUtil.getColumnIndexOrThrow(_cursor, "rest");
          final int _cursorIndexOfRepeats = CursorUtil.getColumnIndexOrThrow(_cursor, "repeats");
          final int _cursorIndexOfCycles = CursorUtil.getColumnIndexOrThrow(_cursor, "cycles");
          final int _cursorIndexOfCooldown = CursorUtil.getColumnIndexOrThrow(_cursor, "cooldown");
          final List<TabataEntity> _result = new ArrayList<TabataEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TabataEntity _item;
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpColor;
            _tmpColor = _cursor.getString(_cursorIndexOfColor);
            final int _tmpWarm_up;
            _tmpWarm_up = _cursor.getInt(_cursorIndexOfWarmUp);
            final int _tmpWork;
            _tmpWork = _cursor.getInt(_cursorIndexOfWork);
            final int _tmpRest;
            _tmpRest = _cursor.getInt(_cursorIndexOfRest);
            final int _tmpRepeats;
            _tmpRepeats = _cursor.getInt(_cursorIndexOfRepeats);
            final int _tmpCycles;
            _tmpCycles = _cursor.getInt(_cursorIndexOfCycles);
            final int _tmpCooldown;
            _tmpCooldown = _cursor.getInt(_cursorIndexOfCooldown);
            _item = new TabataEntity(_tmpName,_tmpColor,_tmpWarm_up,_tmpWork,_tmpRest,_tmpRepeats,_tmpCycles,_tmpCooldown);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _item.setId(_tmpId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<TabataEntity> getTabata(final int id) {
    final String _sql = "SELECT * FROM TabataEntity WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return __db.getInvalidationTracker().createLiveData(new String[]{"TabataEntity"}, false, new Callable<TabataEntity>() {
      @Override
      public TabataEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfColor = CursorUtil.getColumnIndexOrThrow(_cursor, "color");
          final int _cursorIndexOfWarmUp = CursorUtil.getColumnIndexOrThrow(_cursor, "warm_up");
          final int _cursorIndexOfWork = CursorUtil.getColumnIndexOrThrow(_cursor, "work");
          final int _cursorIndexOfRest = CursorUtil.getColumnIndexOrThrow(_cursor, "rest");
          final int _cursorIndexOfRepeats = CursorUtil.getColumnIndexOrThrow(_cursor, "repeats");
          final int _cursorIndexOfCycles = CursorUtil.getColumnIndexOrThrow(_cursor, "cycles");
          final int _cursorIndexOfCooldown = CursorUtil.getColumnIndexOrThrow(_cursor, "cooldown");
          final TabataEntity _result;
          if(_cursor.moveToFirst()) {
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpColor;
            _tmpColor = _cursor.getString(_cursorIndexOfColor);
            final int _tmpWarm_up;
            _tmpWarm_up = _cursor.getInt(_cursorIndexOfWarmUp);
            final int _tmpWork;
            _tmpWork = _cursor.getInt(_cursorIndexOfWork);
            final int _tmpRest;
            _tmpRest = _cursor.getInt(_cursorIndexOfRest);
            final int _tmpRepeats;
            _tmpRepeats = _cursor.getInt(_cursorIndexOfRepeats);
            final int _tmpCycles;
            _tmpCycles = _cursor.getInt(_cursorIndexOfCycles);
            final int _tmpCooldown;
            _tmpCooldown = _cursor.getInt(_cursorIndexOfCooldown);
            _result = new TabataEntity(_tmpName,_tmpColor,_tmpWarm_up,_tmpWork,_tmpRest,_tmpRepeats,_tmpCycles,_tmpCooldown);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _result.setId(_tmpId);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
