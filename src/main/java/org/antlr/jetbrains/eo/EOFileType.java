package org.antlr.jetbrains.eo;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class EOFileType extends LanguageFileType {
	public static final String FILE_EXTENSION = "eo";
		public static final EOFileType INSTANCE = new EOFileType();

	protected EOFileType() {
		super(EOLanguage.INSTANCE);
	}

	@NotNull
	@Override
	public String getName() {
		return "EO";
	}

	@NotNull
	@Override
	public String getDescription() {
		return "EO";
	}

	@NotNull
	@Override
	public String getDefaultExtension() {
		return FILE_EXTENSION;
	}

	@Nullable
	@Override
	public Icon getIcon() {
		return Icons.EO_ICON;
	}
}
