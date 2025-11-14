package ArrayProgram;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class practice {
	public static void main(String[] args) {
		int a[] = { 2, 3, -8, 7, -1, 2, 3 };

		int r=a[0];
		for(int i=0;i<a.length;i++) {
			int sm=0;
			for(int j=i;j<a.length;j++)
		{
				sm=sm+a[j];
		}
		r=Math.max(r, sm);	
		}System.out.println(r);
	}
}