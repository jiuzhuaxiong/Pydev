/*
 * Created on 07/09/2005
 */
package org.python.pydev.ui.interpreters;

import org.eclipse.core.runtime.IProgressMonitor;
import org.python.pydev.ui.pythonpathconf.InterpreterInfo;

public interface IInterpreterObserver {

    /**
     * Notifies observers that the pythonpath has just been restored with the given interpreter information.
     * 
     * @param info the information that has just been restored
     * @param pythonpath the pythonpath (separated by '|') used 
     * @param monitor the monitor used in the restore.
     */
    void notifyPythonpathRestored(InterpreterInfo info, String pythonpath, IProgressMonitor monitor);

    /**
     * Notifies observers that the given interpreter manager has just been restored
     *  
     * @param manager the manager that has just been restored
     */
    void notifyInterpreterManagerRecreated(AbstractInterpreterManager interpreterManager);

}
