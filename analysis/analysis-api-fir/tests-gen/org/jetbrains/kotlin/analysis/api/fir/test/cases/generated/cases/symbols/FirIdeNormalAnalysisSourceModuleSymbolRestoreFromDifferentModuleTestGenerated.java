/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.fir.test.cases.generated.cases.symbols;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.analysis.api.fir.test.configurators.AnalysisApiFirTestConfiguratorFactory;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiTestConfiguratorFactoryData;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiTestConfigurator;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.TestModuleKind;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.FrontendKind;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisSessionMode;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiMode;
import org.jetbrains.kotlin.analysis.api.impl.base.test.cases.symbols.AbstractSymbolRestoreFromDifferentModuleTest;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/analysis-api/testData/symbols/symbolRestoreFromDifferentModule")
@TestDataPath("$PROJECT_ROOT")
public class FirIdeNormalAnalysisSourceModuleSymbolRestoreFromDifferentModuleTestGenerated extends AbstractSymbolRestoreFromDifferentModuleTest {
  @NotNull
  @Override
  public AnalysisApiTestConfigurator getConfigurator() {
    return AnalysisApiFirTestConfiguratorFactory.INSTANCE.createConfigurator(
      new AnalysisApiTestConfiguratorFactoryData(
        FrontendKind.Fir,
        TestModuleKind.Source,
        AnalysisSessionMode.Normal,
        AnalysisApiMode.Ide
      )
    );
  }

  @Test
  public void testAllFilesPresentInSymbolRestoreFromDifferentModule() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/symbols/symbolRestoreFromDifferentModule"), Pattern.compile("^(.+)\\.kt$"), null, true);
  }

  @Test
  @TestMetadata("noDependency.kt")
  public void testNoDependency() {
    runTest("analysis/analysis-api/testData/symbols/symbolRestoreFromDifferentModule/noDependency.kt");
  }

  @Test
  @TestMetadata("withDependency.kt")
  public void testWithDependency() {
    runTest("analysis/analysis-api/testData/symbols/symbolRestoreFromDifferentModule/withDependency.kt");
  }

  @Nested
  @TestMetadata("analysis/analysis-api/testData/symbols/symbolRestoreFromDifferentModule/withTestCompilerPluginEnabled")
  @TestDataPath("$PROJECT_ROOT")
  public class WithTestCompilerPluginEnabled {
    @Test
    public void testAllFilesPresentInWithTestCompilerPluginEnabled() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/symbols/symbolRestoreFromDifferentModule/withTestCompilerPluginEnabled"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @Test
    @TestMetadata("statusCompilerPluginFromDependency.kt")
    public void testStatusCompilerPluginFromDependency() {
      runTest("analysis/analysis-api/testData/symbols/symbolRestoreFromDifferentModule/withTestCompilerPluginEnabled/statusCompilerPluginFromDependency.kt");
    }

    @Test
    @TestMetadata("supertypeCompilerPluginFromDependency.kt")
    public void testSupertypeCompilerPluginFromDependency() {
      runTest("analysis/analysis-api/testData/symbols/symbolRestoreFromDifferentModule/withTestCompilerPluginEnabled/supertypeCompilerPluginFromDependency.kt");
    }
  }
}
