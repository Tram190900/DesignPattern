package StrategyPattern_Sort;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		SortList _sortList = new SortList();
		_sortList.addItem("Tram");
		_sortList.addItem("Trang");
		_sortList.setSortStrategy(new QuickSort());
		_sortList.sort();
		
		_sortList.setSortStrategy(new MergeSort());
		_sortList.sort();
	}
}
