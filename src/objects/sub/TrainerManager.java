package objects.sub;

import java.util.ArrayList;
import java.util.List;

public class TrainerManager {

	public List<Trainer> trainers = new ArrayList<>();

	public void introduceAll() {
		for (Trainer trainer : trainers)
			System.out.println(trainer.introduce());
	}

	public Trainer find(String name) {
		for (Trainer trainer : trainers) {
			if (trainer.getName().equalsIgnoreCase(name))
				return trainer;
		}
		return null;
	}

}
