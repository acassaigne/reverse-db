package org.reverse.db;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CollectionColumns {

    @Test
    public void twoColumnShouldEqualOnAttributs() {
        var c1 = new Column("foo", "String");
        var c2 = new Column("foo", "String");

        assertEquals(c1, c2);
    }

    @Test
    public void emptyCollectionColumns() {
        var collectionColumns = new CollectionsColumns();

        assertEquals(0, collectionColumns.count());
    }

}
