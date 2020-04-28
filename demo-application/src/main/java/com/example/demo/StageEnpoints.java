package com.example.demo;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id="stage")
public class StageEnpoints {
	
	Map<String, Stage> stageMap = new ConcurrentHashMap<>();
	
	@ReadOperation
	public Map<String, Stage> getAllStages(){
		return stageMap;
	}
	
	@ReadOperation
	public Stage getStage(@Selector String name) {
		return stageMap.get(name);
	}
	
	@WriteOperation
	public void setValue(@Selector String name, int stage) {
		stageMap.put(name, new Stage(stage));

	}
	
	static class Stage{
		int stage;
		
		public Stage(int value) {
			this.stage = value;
		}

		public int getStage() {
			return stage;
		}

		public void setStage(int stage) {
			this.stage = stage;
		}
	}
}
