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

import org.eclipse.texlipse.texparser.analysis.*;

@SuppressWarnings("nls")
public final class TCnew extends Token
{
    public TCnew(String text)
    {
        setText(text);
    }

    public TCnew(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TCnew(getText(), getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTCnew(this);
    }
}
