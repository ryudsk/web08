package exam.test20;

import java.util.Map;

import javax.annotation.Resource;

public class Car {
	String model;
	Engine engine;
	Tire[] tires;
	Map<String,Object> options;
	
	public Car() {}
	
	public Car(String model, Engine engine) {
		this.model = model;
		this.engine = engine;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Engine getEngine() {
		return engine;
	}

//	@Autowired(required=false)
//	@Qualifier("kiaEngine")
	@Resource(name="kiaEngine") //Autowired와 같으나, required 설정 불가
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Tire[] getTires() {
		return tires;
	}

	public void setTires(Tire[] tires) {
		this.tires = tires;
	}
	
	public Map<String, Object> getOptions() {
		return options;
	}

	public void setOptions(Map<String, Object> options) {
		this.options = options;
	}

	@Override
	public String toString() {
		StringBuffer carInfo = new StringBuffer();
		carInfo.append("[Car : " + model);
		carInfo.append("\n  " + engine.toString());
		if (tires != null) {
			for (Tire tire : tires) {
				carInfo.append("\n  " + tire.toString());
			}
		}
		
		carInfo.append("\n]");
		return carInfo.toString();
	}
}
