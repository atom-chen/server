/**
 *   Copyright 2013-2015 Sophia
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
*/
package sophia.game;

import sophia.foundation.communication.practice.simulatorPattern.SimulatorCommunicationService;
import sophia.foundation.data.DataService;
import sophia.foundation.task.TaskManager;
import sophia.foundation.util.PropertiesWrapper;
import sophia.game.framework.GameContextResolver;
import sophia.game.persistence.ConnectionManager;
import sophia.game.plugIns.gameModule.GameModule;
import sophia.game.plugIns.gameWorld.GameWorld;
import sophia.game.plugIns.gateWay.GateWay;

public final class GameContext {
	
	private static final GameContextResolver context = new GameContextResolver();
	
	private GameContext() {
		
	}
	
	public static PropertiesWrapper getProperties() {
		return context.getProperty();
	}
	
	public static final void initialize() {
		ConnectionManager.initialize();

	}
	
	public static final TaskManager getTaskManager() {
		return (TaskManager) GameRoot.requestModule(TaskManager.class);
	}
	
	public static final DataService getDataService() {
		return (DataService) GameRoot.requestModule(DataService.class);
	}
	
	public static final GameModule getGameModule() {
		return (GameModule) GameRoot.requestModule(GameModule.class);
	}
	
	public static final GameWorld getGameWorld() {
		return (GameWorld) GameRoot.requestModule(GameWorld.class);
	}
	
	public static final GateWay getGateWay() {
		return (GateWay) GameRoot.requestModule(GateWay.class);
	}
	
	public static final SimulatorCommunicationService getSimulatorCommunicationService(){
		return (SimulatorCommunicationService) GameRoot.requestModule(SimulatorCommunicationService.class);
	}

}
