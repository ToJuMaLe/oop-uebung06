package ueb06;

import java.io.Console;

class Arrays {
	/**
	 * Gibt eine Stringrepraesentation des Arrays zurueck, z.B. [] oder [1, 2, 3]
	 */
	static <T> String toString(T[] array) {
		return "[" + toStringRec(array.length-1,array) + "]";
	}

	static <T> String toStringRec(int pointer,T[] array){
		if(array.length ==0) return "";
		if(pointer==0) return array[0].toString();
		return  toStringRec(pointer-1,array) + ", " + array[pointer];
	}

	/**
	 * Gib zurück, ob ein Objekt in dem Array enthalten ist; verwendet `equals`
	 */
	static <T> boolean contains(T[] array, T object) {
		return containsRec(array.length-1,array,object);
	}

	static <T> boolean containsRec(int pointer,T[]array,T object){
		if(pointer <0 ) return false;
		if(array[pointer].equals(object)) return true;
		return containsRec(pointer-1,array,object);
	}
}
