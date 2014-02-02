package nl.arjanfrans.mario.actions;

import nl.arjanfrans.mario.model.Mario;
import nl.arjanfrans.mario.model.MovingActor;

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
		return new stopImmume(actor);
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

}
