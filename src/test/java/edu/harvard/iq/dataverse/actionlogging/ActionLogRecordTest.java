package edu.harvard.iq.dataverse.actionlogging;

import org.junit.*;

public class ActionLogRecordTest {
    @Test
    public void testSetId() {
        ActionLogRecord a = new ActionLogRecord();
        Assert.assertTrue(a.getId() == null);
        a.setId("id1");
        Assert.assertEquals(a.getId(), "id1");
        a.setId("id2");
        Assert.assertEquals(a.getId(), "id2");
        a.setId("");
        Assert.assertEquals(a.getId(), "");
    }

    @Test
    public void testEquals() {
        ActionLogRecord a1 = new ActionLogRecord();
        ActionLogRecord a2 = new ActionLogRecord();
        Assert.assertTrue(a1.equals(a2));
        a2.setActionType(ActionLogRecord.ActionType.Setting);
        Assert.assertFalse(a1.equals(a2));
        a1.setActionType(ActionLogRecord.ActionType.Setting);
        Assert.assertTrue(a1.equals(a2));
    }
}
