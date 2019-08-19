/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.eclipse.texlipse.texparser.node;

import org.eclipse.texlipse.texparser.analysis.*;

@SuppressWarnings("nls")
public final class TVtext extends Token
{
    public TVtext(String text)
    {
        setText(text);
    }

    public TVtext(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TVtext(getText(), getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTVtext(this);
    }
}
