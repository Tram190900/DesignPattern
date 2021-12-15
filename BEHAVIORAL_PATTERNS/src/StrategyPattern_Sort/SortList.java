package StrategyPattern_Sort;

import java.util.ArrayList;
import java.util.List;

public class SortList {
	SortStrategy sortStrategy;
	List<String> items = new ArrayList<>();
	
	public void setSortStrategy(SortStrategy _sortStrategy) {
		this.sortStrategy = _sortStrategy;
	}
	public void addItem(String str) {
		items.add(str);
	}
	public void sort() {
		sortStrategy.sort(items);
	}
}
