package io.toolisticon.plugins.jenkinsfile.psi;

import com.intellij.psi.tree.IElementType;
import io.toolisticon.plugins.jenkinsfile.JenkinsLanguage;
import org.jetbrains.annotations.*;

public class JenkinsTokenType extends IElementType {
    public JenkinsTokenType(@NotNull @NonNls String debugName) {
        super(debugName, JenkinsLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "JenkinsTokenType." + super.toString();
    }
}