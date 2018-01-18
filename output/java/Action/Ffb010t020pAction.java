package com.ysusoft.Action.purchase;

public class Ffb010t020pAction extends Ffb010tAction {
	@Override
	public void archiveOnIds(){
	    for(String id : ids){
	      setProperty(id, "ffb010t020pArchived", "已归档");
	    }
	    setResult(true, "成功");
	  }
	@Override
	public void activeOnIds(){
	  for(String id : ids){
	    setProperty(id, "ffb010t020pArchived", "未归档");
	  }
	  setResult(true, "成功");
	}
	@Override
	public boolean IsArchived(){
		if("已归档".equals(getDefaultEntity().getFfb010t020pArchived())) return true;
		else return false;
	}
}
