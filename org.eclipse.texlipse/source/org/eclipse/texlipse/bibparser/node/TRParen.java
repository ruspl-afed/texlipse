/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.eclipse.texlipse.bibparser.node;

import org.eclipse.texlipse.bibparser.analysis.*;

@SuppressWarnings("nls")
public final class TRParen extends Token
{
    public TRParen()
    {
        super.setText(")");
    }

    public TRParen(int line, int pos)
    {
        super.setText(")");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TRParen(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTRParen(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TRParen text.");
    }
}
