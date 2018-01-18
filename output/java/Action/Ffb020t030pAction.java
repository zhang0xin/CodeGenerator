package com.ysusoft.Action.purchase;

public class Ffb020t030pAction extends Ffb020tAction {
	@Override
	public void archiveOnIds(){
	    for(String id : ids){
	      setProperty(id, "ffb020t030pArchived", "已归档");
	    }
	    setResult(true, "成功");
	  }
	@Override
	public void activeOnIds(){
	  for(String id : ids){
	    setProperty(id, "ffb020t030pArchived", "未归档");
	  }
	  setResult(true, "成功");
	}
	@Override
	public boolean IsArchived(){
		if("已归档".equals(getDefaultEntity().getFfb020t030pArchived())) return true;
		else return false;
	}
}
