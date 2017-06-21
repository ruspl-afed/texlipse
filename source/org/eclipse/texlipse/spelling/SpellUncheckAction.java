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
package org.eclipse.texlipse.spelling;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.text.TextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorActionDelegate;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.texteditor.ITextEditor;


/**
 * Clear the spelling errors.
 * 
 * @author Kimmo Karlsson
 */
public class SpellUncheckAction implements IEditorActionDelegate {
    
	private IEditorPart targetEditor;

    /**
     * Clear the spelling error markers.
     * @param action the action
	 */
	public void run(IAction action) {
        
        if (targetEditor == null) {
            return;
        }
        if (!(targetEditor instanceof ITextEditor)) {
            return;
        }
        
        ITextEditor textEditor = (ITextEditor) targetEditor;
        IEditorInput input = textEditor.getEditorInput();
        
        if (input instanceof FileEditorInput) {
            SpellChecker.clearMarkers(((FileEditorInput)input).getFile());
        }
	}

	/**
     * Change the active selection.
     * @param action the action
     * @param selection the selection on the currently edited document
	 */
	public void selectionChanged(IAction action, ISelection selection) {
        if (selection instanceof TextSelection) {
            action.setEnabled(true);
            return;
        }
        action.setEnabled(targetEditor instanceof ITextEditor);
	}

    /**
     * Change the active editor.
     * @param action the action
     * @param targetEditor the new active editor
     */
    public void setActiveEditor(IAction action, IEditorPart targetEditor) {
        this.targetEditor = targetEditor;
    }
}
