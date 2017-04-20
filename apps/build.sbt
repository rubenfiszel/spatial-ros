name := "apps"

fork := true

connectInput in run := true

javaOptions in run += "-XX:NativeMemoryTracking=detail"
