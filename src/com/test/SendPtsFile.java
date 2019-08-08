package com.test;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import com.intellij.psi.PsiFile;

public class SendPtsFile extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        Project project = e.getData(PlatformDataKeys.PROJECT);
        PsiFile psiFile = e.getData(PlatformDataKeys.PSI_FILE);

        Messages.showMessageDialog(

                "Hello World!"
                        + "\n " + psiFile.getOriginalFile()
                ,

                "Sample:"

                + "\n " + psiFile.getVirtualFile()
                ,

                Messages.getInformationIcon()

        );
    }
}
