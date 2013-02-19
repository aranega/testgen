#!/bin/sh
#mkdir -p taskManger/taskManger-component-parent/ && cd taskManger/taskManger-component-parent/ && mvn archetype:generate -B -DarchetypeGroupId=com.dooapp -DarchetypeArtifactId=component-archetype -DgroupId=com.dooapp -DartifactId=taskManger-user-component -Dversion=1.0-SNAPSHOT -DFileShortName=User -DJavaShortName=User -Dauthor=genmymodel -Dtime=`date +%s` -DDOMAIN=USER -DwrapperPackage=com.dooapp.taskManger.wrapper -DdomainPackage=com.dooapp.taskManger.entity -DbuilderPackage=com.dooapp.taskManger.entity.factories&& mvn archetype:generate -B -DarchetypeGroupId=com.dooapp -DarchetypeArtifactId=component-archetype -DgroupId=com.dooapp -DartifactId=taskManger-delayedtask-component -Dversion=1.0-SNAPSHOT -DFileShortName=DelayedTask -DJavaShortName=DelayedTask -Dauthor=genmymodel -Dtime=`date +%s` -DDOMAIN=DELAYEDTASK -DwrapperPackage=com.dooapp.taskManger.wrapper -DdomainPackage=com.dooapp.taskManger.entity -DbuilderPackage=com.dooapp.taskManger.entity.factories&& mvn archetype:generate -B -DarchetypeGroupId=com.dooapp -DarchetypeArtifactId=component-archetype -DgroupId=com.dooapp -DartifactId=taskManger-task-component -Dversion=1.0-SNAPSHOT -DFileShortName=Task -DJavaShortName=Task -Dauthor=genmymodel -Dtime=`date +%s` -DDOMAIN=TASK -DwrapperPackage=com.dooapp.taskManger.wrapper -DdomainPackage=com.dooapp.taskManger.entity -DbuilderPackage=com.dooapp.taskManger.entity.factories
mkdir -p taskManger-component-parent/ && cd taskManger-component-parent/ && mvn archetype:generate -B -DarchetypeGroupId=com.dooapp -DarchetypeArtifactId=component-archetype -DgroupId=com.dooapp -DartifactId=taskManger-user-component -Dversion=1.0-SNAPSHOT -DFileShortName=User -DJavaShortName=User -Dauthor=genmymodel -Dtime=`date +%s` -DDOMAIN=USER -DwrapperPackage=com.dooapp.taskManger.wrapper -DdomainPackage=com.dooapp.taskManger.entity -DbuilderPackage=com.dooapp.taskManger.entity.factories&& mvn archetype:generate -B -DarchetypeGroupId=com.dooapp -DarchetypeArtifactId=component-archetype -DgroupId=com.dooapp -DartifactId=taskManger-delayedtask-component -Dversion=1.0-SNAPSHOT -DFileShortName=DelayedTask -DJavaShortName=DelayedTask -Dauthor=genmymodel -Dtime=`date +%s` -DDOMAIN=DELAYEDTASK -DwrapperPackage=com.dooapp.taskManger.wrapper -DdomainPackage=com.dooapp.taskManger.entity -DbuilderPackage=com.dooapp.taskManger.entity.factories&& mvn archetype:generate -B -DarchetypeGroupId=com.dooapp -DarchetypeArtifactId=component-archetype -DgroupId=com.dooapp -DartifactId=taskManger-task-component -Dversion=1.0-SNAPSHOT -DFileShortName=Task -DJavaShortName=Task -Dauthor=genmymodel -Dtime=`date +%s` -DDOMAIN=TASK -DwrapperPackage=com.dooapp.taskManger.wrapper -DdomainPackage=com.dooapp.taskManger.entity -DbuilderPackage=com.dooapp.taskManger.entity.factories
