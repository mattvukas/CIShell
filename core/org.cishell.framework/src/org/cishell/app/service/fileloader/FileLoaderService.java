package org.cishell.app.service.fileloader;

import java.io.File;

import org.cishell.framework.CIShellContext;
import org.cishell.framework.algorithm.AlgorithmFactory;
import org.cishell.framework.algorithm.ProgressMonitor;
import org.cishell.framework.data.Data;
import org.osgi.framework.BundleContext;
import org.osgi.service.log.LogService;

public interface FileLoaderService {
	public void registerListener(FileLoadListener listener);
	public void unregisterListener(FileLoadListener listener);

	/* TODO make abstract default class, template method pattern, blah blah */
	public File[] getFilesToLoadFromUser(
			boolean selectSingleFile, String[] filterExtensions) throws FileLoadException;
	public Data[] loadFilesFromUserSelection(
			BundleContext bundleContext,
			CIShellContext ciShellContext,
			LogService logger,
			ProgressMonitor progressMonitor,
			boolean selectSingleFile) throws FileLoadException;
	public Data[] loadFiles(
			BundleContext bundleContext,
			CIShellContext ciShellContext,
			LogService logger,
			ProgressMonitor progressMonitor,
			File[] files) throws FileLoadException;
	public Data[] loadFile(
			BundleContext bundleContext,
			CIShellContext ciShellContext,
			LogService logger,
			ProgressMonitor progressMonitor,
			File file) throws FileLoadException;
	public Data[] loadFileOfType(
			BundleContext bundleContext,
			CIShellContext ciShellContext,
			LogService logger,
			ProgressMonitor progressMonitor,
			File file,
			String fileExtension,
			String mimeType) throws FileLoadException;
	public Data[] loadFileOfType(
			BundleContext bundleContext,
			CIShellContext ciShellContext,
			LogService logger,
			ProgressMonitor progressMonitor,
			File file,
			AlgorithmFactory validator) throws FileLoadException;
}