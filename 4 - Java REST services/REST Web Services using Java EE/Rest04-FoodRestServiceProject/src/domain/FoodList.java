package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

@XmlRootElement
@XmlSeeAlso(Food.class)
public class FoodList extends ArrayList<Food> {
	private static final long serialVersionUID = 1L;
	
	public FoodList(Collection<? extends Food> c) {
		super(c);
	}
	
	public FoodList() {
		// TODO Auto-generated constructor stub
	}

	@XmlElement(name = "Foods")
	public List<Food> getFoods() {
		return this;
	}
	
	public void addFoods(List<Food> foods) {
		this.addAll(foods);
	}
}