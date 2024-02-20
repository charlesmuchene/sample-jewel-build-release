# Jewel :runReleaseDistributable Bug

This project is a sample to reproduce issue: https://github.com/JetBrains/jewel/issues/306

## Environment

| Dependency | Version         |
|------------|-----------------|
| Jewel      | 0.14.1          |
| Compose    | 1.6.0-dev1397   |
| JDK        | jbr-17 --arch64 |
| Kotlin     | 1.8.21          |
| Gradle     | 8.5             |

## Description

Running the `:runReleaseDistributable` task fails with the following error:
> Exception in thread "main" java.lang.IncompatibleClassChangeError: class org.jetbrains.jewel.ui.painter.SvgPainterHint
> cannot extend sealed interface org.jetbrains.jewel.ui.painter.PainterHint

<details>
<summary>Expand for the full stacktrace</summary>

```
Exception in thread "main" java.lang.IncompatibleClassChangeError: class org.jetbrains.jewel.ui.painter.PainterPathHint cannot extend sealed interface org.jetbrains.jewel.ui.painter.PainterHint
	at java.base/java.lang.ClassLoader.defineClass1(Native Method)
	at java.base/java.lang.ClassLoader.defineClass(Unknown Source)
	at java.base/java.security.SecureClassLoader.defineClass(Unknown Source)
	at java.base/jdk.internal.loader.BuiltinClassLoader.defineClass(Unknown Source)
	at java.base/jdk.internal.loader.BuiltinClassLoader.findClassOnClassPathOrNull(Unknown Source)
	at java.base/jdk.internal.loader.BuiltinClassLoader.loadClassOrNull(Unknown Source)
	at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(Unknown Source)
	at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(Unknown Source)
	at java.base/java.lang.ClassLoader.loadClass(Unknown Source)
	at java.base/java.lang.ClassLoader.defineClass1(Native Method)
	at java.base/java.lang.ClassLoader.defineClass(Unknown Source)
	at java.base/java.security.SecureClassLoader.defineClass(Unknown Source)
	at java.base/jdk.internal.loader.BuiltinClassLoader.defineClass(Unknown Source)
	at java.base/jdk.internal.loader.BuiltinClassLoader.findClassOnClassPathOrNull(Unknown Source)
	at java.base/jdk.internal.loader.BuiltinClassLoader.loadClassOrNull(Unknown Source)
	at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(Unknown Source)
	at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(Unknown Source)
	at java.base/java.lang.ClassLoader.loadClass(Unknown Source)
	at org.jetbrains.jewel.ui.painter.hints.PathOverrideKt.PathOverride(PathOverride.kt:34)
	at org.jetbrains.jewel.intui.standalone.StandalonePainterHintsProvider.<init>(StandalonePainterHintsProvider.kt:32)
	at org.jetbrains.jewel.intui.standalone.theme.IntUiThemeKt$IntUiTheme$2.invoke(IntUiTheme.kt:1221)
	at androidx.compose.runtime.internal.ComposableLambdaImpl.invoke(ComposableLambda.jb.kt:107)
	at androidx.compose.runtime.internal.ComposableLambdaImpl.invoke(ComposableLambda.jb.kt:33)
	at androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(CompositionLocal.kt:228)
	at org.jetbrains.jewel.ui.theme.JewelThemeKt$BaseJewelTheme$2$1.invoke(JewelTheme.kt:2197)
	at androidx.compose.runtime.internal.ComposableLambdaImpl.invoke(ComposableLambda.jb.kt:107)
	at androidx.compose.runtime.internal.ComposableLambdaImpl.invoke(ComposableLambda.jb.kt:33)
	at androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(CompositionLocal.kt:228)
	at org.jetbrains.jewel.ui.theme.JewelThemeKt$BaseJewelTheme$2.invoke(JewelTheme.kt:2192)
	at androidx.compose.runtime.internal.ComposableLambdaImpl.invoke(ComposableLambda.jb.kt:107)
	at androidx.compose.runtime.internal.ComposableLambdaImpl.invoke(ComposableLambda.jb.kt:33)
	at androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(CompositionLocal.kt:228)
	at org.jetbrains.jewel.foundation.theme.JewelThemeKt.JewelTheme(JewelTheme.kt:64)
	at org.jetbrains.jewel.foundation.theme.JewelThemeKt$JewelTheme$1.invoke(JewelTheme.kt:2058)
	at androidx.compose.runtime.internal.ComposableLambdaImpl.invoke(ComposableLambda.jb.kt:107)
	at androidx.compose.runtime.internal.ComposableLambdaImpl.invoke(ComposableLambda.jb.kt:33)
	at androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(CompositionLocal.kt:248)
	at org.jetbrains.jewel.foundation.theme.JewelThemeKt.JewelTheme(JewelTheme.kt:57)
	at org.jetbrains.jewel.ui.theme.JewelThemeKt.BaseJewelTheme(JewelTheme.kt:191)
	at org.jetbrains.jewel.intui.standalone.theme.IntUiThemeKt.IntUiTheme(IntUiTheme.kt:215)
	at org.jetbrains.jewel.intui.standalone.theme.IntUiThemeKt.IntUiTheme(IntUiTheme.kt:200)
	at ComposableSingletons$AppKt$lambda-2$1.invoke(App.kt:2014)
	at androidx.compose.runtime.internal.ComposableLambdaImpl.invoke(ComposableLambda.jb.kt:116)
	at androidx.compose.runtime.internal.ComposableLambdaImpl.invoke(ComposableLambda.jb.kt:33)
	at androidx.compose.ui.window.Application_desktopKt$application$1$1.invoke(Application.desktop.kt:2115)
	at androidx.compose.runtime.internal.ComposableLambdaImpl.invoke(ComposableLambda.jb.kt:116)
	at androidx.compose.runtime.internal.ComposableLambdaImpl.invoke(ComposableLambda.jb.kt:33)
	at androidx.compose.ui.window.Application_desktopKt$awaitApplication$2$1$2$1$1.invoke(Application.desktop.kt:1227)
	at androidx.compose.runtime.internal.ComposableLambdaImpl.invoke(ComposableLambda.jb.kt:107)
	at androidx.compose.runtime.internal.ComposableLambdaImpl.invoke(ComposableLambda.jb.kt:33)
	at androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(CompositionLocal.kt:228)
	at androidx.compose.ui.window.Application_desktopKt$awaitApplication$2$1$2$1.invoke(Application.desktop.kt:1221)
	at androidx.compose.runtime.internal.ComposableLambdaImpl.invoke(ComposableLambda.jb.kt:107)
	at androidx.compose.runtime.internal.ComposableLambdaImpl.invoke(ComposableLambda.jb.kt:33)
	at androidx.compose.foundation.gestures.ForEachGestureKt.invokeComposable(ForEachGesture.kt:11033)
	at androidx.compose.runtime.ComposerImpl.doCompose(Composer.kt:3303)
	at androidx.compose.runtime.ComposerImpl.composeContent$runtime(Composer.kt:3236)
	at androidx.compose.runtime.CompositionImpl.composeContent(Composition.kt:723)
	at androidx.compose.runtime.Recomposer.composeInitial$runtime(Recomposer.kt:1071)
	at androidx.compose.runtime.CompositionImpl.setContent(Composition.kt:3631)
	at androidx.compose.ui.window.Application_desktopKt$awaitApplication$2$1$2.invokeSuspend(Application.desktop.kt:219)
	at kotlin.coroutines.jvm.internal.BaseContinuationImpl.resumeWith(ContinuationImpl.kt:33)
	at kotlinx.coroutines.DispatchedTask.run(DispatchedTask.kt:108)
	at java.desktop/java.awt.event.InvocationEvent.dispatch(Unknown Source)
	at java.desktop/java.awt.EventQueue.dispatchEventImpl(Unknown Source)
	at java.desktop/java.awt.EventQueue$3.run(Unknown Source)
	at java.desktop/java.awt.EventQueue$3.run(Unknown Source)
	at java.base/java.security.AccessController.doPrivileged(Unknown Source)
	at java.base/java.security.ProtectionDomain$JavaSecurityAccessImpl.doIntersectionPrivilege(Unknown Source)
	at java.desktop/java.awt.EventQueue.dispatchEvent(Unknown Source)
	at java.desktop/java.awt.EventDispatchThread.pumpOneEventForFilters(Unknown Source)
	at java.desktop/java.awt.EventDispatchThread.pumpEventsForFilter(Unknown Source)
	at java.desktop/java.awt.EventDispatchThread.pumpEventsForHierarchy(Unknown Source)
	at java.desktop/java.awt.EventDispatchThread.pumpEvents(Unknown Source)
	at java.desktop/java.awt.EventDispatchThread.pumpEvents(Unknown Source)
	at java.desktop/java.awt.EventDispatchThread.run(Unknown Source)
Failed to launch JVM
```
</details>

## Discovery

https://kotlinlang.slack.com/archives/C05T8U2C31T/p1708352006916399
