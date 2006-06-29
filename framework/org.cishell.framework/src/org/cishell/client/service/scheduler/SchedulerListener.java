/* **************************************************************************** 
 * CIShell: Cyberinfrastructure Shell, An Algorithm Integration Framework.
 * 
 * All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Apache License v2.0 which accompanies
 * this distribution, and is available at:
 * http://www.apache.org/licenses/LICENSE-2.0.html
 * 
 * Created on Jun 14, 2006 at Indiana University.
 * 
 * Contributors:
 *     Indiana University - 
 * ***************************************************************************/
package org.cishell.client.service.scheduler;

import java.util.Calendar;

import org.cishell.framework.algorithm.Algorithm;
import org.cishell.framework.datamodel.DataModel;


public interface SchedulerListener {
    public void algorithmScheduled(Algorithm algorithm, Calendar time);
    public void algorithmRescheduled(Algorithm algorithm, Calendar time);
    public void algorithmStarted(Algorithm algorithm);
    public void algorithmFinished(Algorithm algorithm, DataModel[] createdDM);
    public void algorithmError(Algorithm algorithm, Exception error);
    
    public void schedulerRunStateChanged(boolean isRunning);
    public void schedulerCleared();
}
