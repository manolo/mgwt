package com.googlecode.mgwt.ui.client.theme.platform.list.celllist;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.DataResource;

import com.googlecode.mgwt.ui.client.widget.list.celllist.GroupingCellListAbstractAppearance;

public class GroupingCellListIPadAppearance extends GroupingCellListAbstractAppearance {

  static {
    Resources.INSTANCE.css().ensureInjected();
  }

  interface Resources extends ClientBundle {

    Resources INSTANCE = GWT.create(Resources.class);

    @Source({"celllist-base.css", "celllist-ipad.css"})
    CellListCss css();
    
    @Source({"grouping-celllist-base.css", "grouping-celllist-ipad.css"})
    GroupingListCss groupCss();
    
    @Source("arrow.png")
    DataResource listArrow();
  }

  @Override
  public CellListCss css() {
    return Resources.INSTANCE.css();
  }

  @Override
  public GroupingListCss groupCss() {
    return Resources.INSTANCE.groupCss();
  }
}
