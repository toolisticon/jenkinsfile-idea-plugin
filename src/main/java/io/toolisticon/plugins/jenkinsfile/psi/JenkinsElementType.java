package io.toolisticon.plugins.jenkinsfile.psi;

import com.intellij.psi.tree.IElementType;
import io.toolisticon.plugins.jenkinsfile.JenkinsLanguage;
import org.jetbrains.annotations.*;

public class JenkinsElementType extends IElementType {
    public JenkinsElementType(@NotNull @NonNls String debugName) {
        super(debugName, JenkinsLanguage.INSTANCE);
    }
}