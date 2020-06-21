# makeoom

nio oom
```shell script
java -XX:NativeMemoryTracking=detail -cp target\classes wjs.jvm.NIODirectMemory
```

heap segmentation
```shell script
java -Xmx8m -Xms1m -cp target\classes wjs.jvm.OnlySleep
```
