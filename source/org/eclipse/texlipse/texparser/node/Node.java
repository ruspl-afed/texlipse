/*******************************************************************************
 * Copyright (c) 2017 the TeXlipse team and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     The TeXlipse team - initial API and implementation
 *******************************************************************************/
/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.eclipse.texlipse.texparser.node;

import java.util.*;

@SuppressWarnings("nls")
public abstract class Node implements Switchable, Cloneable
{
    private Node parent;

    @Override
    public abstract Object clone();

    public Node parent()
    {
        return this.parent;
    }

    void parent(@SuppressWarnings("hiding") Node parent)
    {
        this.parent = parent;
    }

    abstract void removeChild(Node child);
    abstract void replaceChild(Node oldChild, Node newChild);

    public void replaceBy(Node node)
    {
        this.parent.replaceChild(this, node);
    }

    protected String toString(Node node)
    {
        if(node != null)
        {
            return node.toString();
        }

        return "";
    }

    protected String toString(List list)
    {
        StringBuffer s = new StringBuffer();

        for(Iterator i = list.iterator(); i.hasNext();)
        {
            s.append(i.next());
        }

        return s.toString();
    }

    @SuppressWarnings("unchecked")
    protected <T extends Node> T cloneNode(T node)
    {
        if(node != null)
        {
            return (T) node.clone();
        }

        return null;
    }

    protected <T> List<T> cloneList(List<T> list)
    {
        List<T> clone = new LinkedList<T>();

        for(T n : list)
        {
            clone.add(n);
        }

        return clone;
    }
}
