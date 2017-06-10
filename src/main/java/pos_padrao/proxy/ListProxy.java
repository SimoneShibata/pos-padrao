package pos_padrao.proxy;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import javax.management.RuntimeErrorException;

public class ListProxy implements List {

	private List original;
	
	public ListProxy(List list) {
		this.original = list;
	}
	
	public boolean add(Object e) {
		throw new RuntimeErrorException(null, "Não pode adicionar");
	}

	public void add(int index, Object element) {
		throw new RuntimeErrorException(null, "Não pode adicionar");
	}

	public boolean addAll(Collection c) {
		throw new RuntimeErrorException(null, "Não pode adicionar");
	}

	public boolean addAll(int index, Collection c) {
		throw new RuntimeErrorException(null, "Não pode adicionar");
	}

	public void clear() {
		throw new RuntimeErrorException(null, "Não pode limpar esta lista");
	}

	public boolean contains(Object o) {
		return this.original.contains(o);
	}

	public boolean containsAll(Collection c) {
		return this.original.containsAll(c);
	}

	public Object get(int index) {
		return this.original.get(index);
	}

	public int indexOf(Object o) {
		return this.original.indexOf(o);
	}

	public boolean isEmpty() {
		return this.original.isEmpty();
	}

	public Iterator iterator() {
		return this.original.iterator();
	}

	public int lastIndexOf(Object o) {
		return this.original.lastIndexOf(o);
	}

	public ListIterator listIterator() {
		return this.original.listIterator();
	}

	public ListIterator listIterator(int index) {
		return this.original.listIterator(index);
	}

	public boolean remove(Object o) {
		throw new RuntimeErrorException(null, "Não pode remover nada desta lista");
	}

	public Object remove(int index) {
		throw new RuntimeErrorException(null, "Não pode remover nada desta lista");
	}

	public boolean removeAll(Collection c) {
		throw new RuntimeErrorException(null, "Não pode remover nada desta lista");
	}

	public boolean retainAll(Collection c) {
		throw new RuntimeErrorException(null, "Não pode remover nada desta lista");
	}

	public Object set(int index, Object element) {
		throw new RuntimeErrorException(null, "Não pode setar nada nesta lista");
	}

	public int size() {
		return this.original.size();
	}

	public List subList(int fromIndex, int toIndex) {
		return this.original.subList(fromIndex, toIndex);
	}

	public Object[] toArray() {
		return this.original.toArray();
	}

	public Object[] toArray(Object[] a) {
		return this.original.toArray(a);
	}

}
