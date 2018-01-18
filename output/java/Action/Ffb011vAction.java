package com.ysusoft.Action.purchase;

public class Ffb011vAction extends Ffb011vAction {
	@Override
	public void archiveOnIds(){
	    for(String id : ids){
	      setProperty(id, "ffb011vArchived", "已归档");
	    }
	    setResult(true, "成功");
	  }
	@Override
	public void activeOnIds(){
	  for(String id : ids){
	    setProperty(id, "ffb011vArchived", "未归档");
	  }
	  setResult(true, "成功");
	}
	@Override
	public boolean IsArchived(){
		if("已归档".equals(getDefaultEntity().getFfb011vArchived())) return true;
		else return false;
	}
}
