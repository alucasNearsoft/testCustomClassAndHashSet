package com.companyname.col;

import java.util.HashSet;
import java.util.Set;

/**
 * The class must override equals() and hashCode(); otherwise, duplicate class instances can be stored in the hashset.
 * this example overrides equals(). Remove hashCode() to notice the "51 Pegasi b" duplicated on the output.
 */
class CustomClassAndHashSet
{
	public static void main(String[] args)
	{
		Set<Planet> sp = new HashSet<>();
		sp.add(new Planet("Mercury"));
		sp.add(new Planet("Venus"));
		sp.add(new Planet("Earth"));
		sp.add(new Planet("Mars"));
		sp.add(new Planet("Jupiter"));
		sp.add(new Planet("Saturn"));
		sp.add(new Planet("Uranus"));
		sp.add(new Planet("Neptune"));
		sp.add(new Planet("Fomalhaut b"));
		Planet p1 = new Planet("51 Pegasi b");
		sp.add(p1);
		Planet p2 = new Planet("51 Pegasi b");
		sp.add(p2);
		System.out.println(p1.equals(p2));
		System.out.println(sp);
	}
}
class Planet
{
	private String name;
	Planet(String name)
	{
		this.name = name;
	}
	@Override
	public boolean equals(Object o)
	{
		if (!(o instanceof Planet))
			return false;
		Planet p = (Planet) o;
		return p.name.equals(name);
	}
	String getName()
	{
		return name;
	}
	@Override
	public int hashCode()
	{
		return name.hashCode();
	}
	@Override
	public String toString()
	{
		return name;
	}
}