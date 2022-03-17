2022/3/17 第三次提交 暗色模式bug 
2022/3/17 第四次提交修改内容
          背景音乐不能循环播放，播放完关掉再打开音乐开关闪退
          mediaPlayer.setLooping(true)解决循环播放和闪退问题
          去掉了顶部导航栏（在AndroidManifest.xml文件中修改），colors.xml文件中添加自定义颜色