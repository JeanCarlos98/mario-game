package nl.arjanfrans.mario.actions;

import nl.arjanfrans.mario.model.Mario;
import nl.arjanfrans.mario.model.MovingActor;
import nl.arjanfrans.mario.model.MovingActor.Direction;
import nl.arjanfrans.mario.model.MovingActor.State;

import com.badlogic.gdx.scenes.scene2d.Action;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;

public class MarioActions extends Actions {
	
	public static Action stopImmumeAction(Mario actor) {
		return new stopImmume(actor);
	}

	static public class stopImmume extends Action {
		public stopImmume(Mario actor) {
			this.actor = actor;
		}

		public boolean act(float delta) {
			((Mario) actor).setImmume(false);
			return true;
		}
	}
	
	
	
	public static Action bigMarioAction(Mario actor) {
		return new bigMario(actor);
	}

	static public class bigMario extends Action {
		public bigMario(Mario actor) {
			this.actor = actor;
		}

		public boolean act(float delta) {
			((Mario) actor).setImmume(false);
			return true;
		}
	}
	
	public static Action setStateAction(Mario actor, State state) {
		return new setState(actor, state);
	}

	static public class setState extends Action {
		private State state;
		
		public setState(Mario actor, State state) {
			this.actor = actor;
			this.state = state;
		}

		public boolean act(float delta) {
			((Mario) actor).setState(state);
			return true;
		}
	}
	
	public static Action walkToAction(Mario actor, float x, float y) {
		return new walkTo(actor, x, y);
	}

	static public class walkTo extends Action {
		private float x;
		private float y;
		
		public walkTo(Mario actor, float x, float y) {
			this.actor = actor;
			this.x = x;
			this.y = y;
			((Mario) actor).setControlsEnabled(false);
			
		}

		public boolean act(float delta) {
			if(actor.getX() < x) {
				((Mario) actor).move(Direction.RIGHT);
				return false;
			}
			return true;
		}
	}

}
