package com.ysusoft.Action.purchase;

public class Ffb012tAction extends Ffb012tAction {
	@Override
	public void archiveOnIds(){
	    for(String id : ids){
	      setProperty(id, "ffb012tArchived", "已归档");
	    }
	    setResult(true, "成功");
	  }
	@Override
	public void activeOnIds(){
	  for(String id : ids){
	    setProperty(id, "ffb012tArchived", "未归档");
	  }
	  setResult(true, "成功");
	}
	@Override
	public boolean IsArchived(){
		if("已归档".equals(getDefaultEntity().getFfb012tArchived())) return true;
		else return false;
	}
}
