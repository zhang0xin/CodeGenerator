package com.ysusoft.Action.purchase;

public class Ffb060tAction extends Ffb060tAction {
	@Override
	public void archiveOnIds(){
	    for(String id : ids){
	      setProperty(id, "ffb060tArchived", "已归档");
	    }
	    setResult(true, "成功");
	  }
	@Override
	public void activeOnIds(){
	  for(String id : ids){
	    setProperty(id, "ffb060tArchived", "未归档");
	  }
	  setResult(true, "成功");
	}
	@Override
	public boolean IsArchived(){
		if("已归档".equals(getDefaultEntity().getFfb060tArchived())) return true;
		else return false;
	}
}
