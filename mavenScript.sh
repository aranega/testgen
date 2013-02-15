#!/bin/sh
#mkdir -p petshop/petshop-component-parent/ && cd petshop/petshop-component-parent/ && mvn archetype:generate -B -DarchetypeGroupId=com.dooapp -DarchetypeArtifactId=component-archetype -DgroupId=com.genmymodel -DartifactId=petshop-food-component -Dversion=1.0-SNAPSHOT -DFileShortName=Food -DJavaShortName=Food -Dauthor=genmymodel -Dtime=`date +%s` -DDOMAIN=FOOD -DwrapperPackage=com.genmymodel.petshop.wrapper -DdomainPackage=com.genmymodel.petshop.entity -DbuilderPackage=com.genmymodel.petshop.entity.factories&& mvn archetype:generate -B -DarchetypeGroupId=com.dooapp -DarchetypeArtifactId=component-archetype -DgroupId=com.genmymodel -DartifactId=petshop-customer-component -Dversion=1.0-SNAPSHOT -DFileShortName=Customer -DJavaShortName=Customer -Dauthor=genmymodel -Dtime=`date +%s` -DDOMAIN=CUSTOMER -DwrapperPackage=com.genmymodel.petshop.wrapper -DdomainPackage=com.genmymodel.petshop.entity -DbuilderPackage=com.genmymodel.petshop.entity.factories&& mvn archetype:generate -B -DarchetypeGroupId=com.dooapp -DarchetypeArtifactId=component-archetype -DgroupId=com.genmymodel -DartifactId=petshop-product-component -Dversion=1.0-SNAPSHOT -DFileShortName=Product -DJavaShortName=Product -Dauthor=genmymodel -Dtime=`date +%s` -DDOMAIN=PRODUCT -DwrapperPackage=com.genmymodel.petshop.wrapper -DdomainPackage=com.genmymodel.petshop.entity -DbuilderPackage=com.genmymodel.petshop.entity.factories&& mvn archetype:generate -B -DarchetypeGroupId=com.dooapp -DarchetypeArtifactId=component-archetype -DgroupId=com.genmymodel -DartifactId=petshop-order-component -Dversion=1.0-SNAPSHOT -DFileShortName=Order -DJavaShortName=Order -Dauthor=genmymodel -Dtime=`date +%s` -DDOMAIN=ORDER -DwrapperPackage=com.genmymodel.petshop.wrapper -DdomainPackage=com.genmymodel.petshop.entity -DbuilderPackage=com.genmymodel.petshop.entity.factories&& mvn archetype:generate -B -DarchetypeGroupId=com.dooapp -DarchetypeArtifactId=component-archetype -DgroupId=com.genmymodel -DartifactId=petshop-address-component -Dversion=1.0-SNAPSHOT -DFileShortName=Address -DJavaShortName=Address -Dauthor=genmymodel -Dtime=`date +%s` -DDOMAIN=ADDRESS -DwrapperPackage=com.genmymodel.petshop.wrapper -DdomainPackage=com.genmymodel.petshop.entity -DbuilderPackage=com.genmymodel.petshop.entity.factories&& mvn archetype:generate -B -DarchetypeGroupId=com.dooapp -DarchetypeArtifactId=component-archetype -DgroupId=com.genmymodel -DartifactId=petshop-item-component -Dversion=1.0-SNAPSHOT -DFileShortName=Item -DJavaShortName=Item -Dauthor=genmymodel -Dtime=`date +%s` -DDOMAIN=ITEM -DwrapperPackage=com.genmymodel.petshop.wrapper -DdomainPackage=com.genmymodel.petshop.entity -DbuilderPackage=com.genmymodel.petshop.entity.factories&& mvn archetype:generate -B -DarchetypeGroupId=com.dooapp -DarchetypeArtifactId=component-archetype -DgroupId=com.genmymodel -DartifactId=petshop-toy-component -Dversion=1.0-SNAPSHOT -DFileShortName=Toy -DJavaShortName=Toy -Dauthor=genmymodel -Dtime=`date +%s` -DDOMAIN=TOY -DwrapperPackage=com.genmymodel.petshop.wrapper -DdomainPackage=com.genmymodel.petshop.entity -DbuilderPackage=com.genmymodel.petshop.entity.factories&& mvn archetype:generate -B -DarchetypeGroupId=com.dooapp -DarchetypeArtifactId=component-archetype -DgroupId=com.genmymodel -DartifactId=petshop-cart-component -Dversion=1.0-SNAPSHOT -DFileShortName=Cart -DJavaShortName=Cart -Dauthor=genmymodel -Dtime=`date +%s` -DDOMAIN=CART -DwrapperPackage=com.genmymodel.petshop.wrapper -DdomainPackage=com.genmymodel.petshop.entity -DbuilderPackage=com.genmymodel.petshop.entity.factories
mkdir -p petshop-component-parent/ && cd petshop-component-parent/ && mvn archetype:generate -B -DarchetypeGroupId=com.dooapp -DarchetypeArtifactId=component-archetype -DgroupId=com.genmymodel -DartifactId=petshop-food-component -Dversion=1.0-SNAPSHOT -DFileShortName=Food -DJavaShortName=Food -Dauthor=genmymodel -Dtime=`date +%s` -DDOMAIN=FOOD -DwrapperPackage=com.genmymodel.petshop.wrapper -DdomainPackage=com.genmymodel.petshop.entity -DbuilderPackage=com.genmymodel.petshop.entity.factories&& mvn archetype:generate -B -DarchetypeGroupId=com.dooapp -DarchetypeArtifactId=component-archetype -DgroupId=com.genmymodel -DartifactId=petshop-customer-component -Dversion=1.0-SNAPSHOT -DFileShortName=Customer -DJavaShortName=Customer -Dauthor=genmymodel -Dtime=`date +%s` -DDOMAIN=CUSTOMER -DwrapperPackage=com.genmymodel.petshop.wrapper -DdomainPackage=com.genmymodel.petshop.entity -DbuilderPackage=com.genmymodel.petshop.entity.factories&& mvn archetype:generate -B -DarchetypeGroupId=com.dooapp -DarchetypeArtifactId=component-archetype -DgroupId=com.genmymodel -DartifactId=petshop-product-component -Dversion=1.0-SNAPSHOT -DFileShortName=Product -DJavaShortName=Product -Dauthor=genmymodel -Dtime=`date +%s` -DDOMAIN=PRODUCT -DwrapperPackage=com.genmymodel.petshop.wrapper -DdomainPackage=com.genmymodel.petshop.entity -DbuilderPackage=com.genmymodel.petshop.entity.factories&& mvn archetype:generate -B -DarchetypeGroupId=com.dooapp -DarchetypeArtifactId=component-archetype -DgroupId=com.genmymodel -DartifactId=petshop-order-component -Dversion=1.0-SNAPSHOT -DFileShortName=Order -DJavaShortName=Order -Dauthor=genmymodel -Dtime=`date +%s` -DDOMAIN=ORDER -DwrapperPackage=com.genmymodel.petshop.wrapper -DdomainPackage=com.genmymodel.petshop.entity -DbuilderPackage=com.genmymodel.petshop.entity.factories&& mvn archetype:generate -B -DarchetypeGroupId=com.dooapp -DarchetypeArtifactId=component-archetype -DgroupId=com.genmymodel -DartifactId=petshop-address-component -Dversion=1.0-SNAPSHOT -DFileShortName=Address -DJavaShortName=Address -Dauthor=genmymodel -Dtime=`date +%s` -DDOMAIN=ADDRESS -DwrapperPackage=com.genmymodel.petshop.wrapper -DdomainPackage=com.genmymodel.petshop.entity -DbuilderPackage=com.genmymodel.petshop.entity.factories&& mvn archetype:generate -B -DarchetypeGroupId=com.dooapp -DarchetypeArtifactId=component-archetype -DgroupId=com.genmymodel -DartifactId=petshop-item-component -Dversion=1.0-SNAPSHOT -DFileShortName=Item -DJavaShortName=Item -Dauthor=genmymodel -Dtime=`date +%s` -DDOMAIN=ITEM -DwrapperPackage=com.genmymodel.petshop.wrapper -DdomainPackage=com.genmymodel.petshop.entity -DbuilderPackage=com.genmymodel.petshop.entity.factories&& mvn archetype:generate -B -DarchetypeGroupId=com.dooapp -DarchetypeArtifactId=component-archetype -DgroupId=com.genmymodel -DartifactId=petshop-toy-component -Dversion=1.0-SNAPSHOT -DFileShortName=Toy -DJavaShortName=Toy -Dauthor=genmymodel -Dtime=`date +%s` -DDOMAIN=TOY -DwrapperPackage=com.genmymodel.petshop.wrapper -DdomainPackage=com.genmymodel.petshop.entity -DbuilderPackage=com.genmymodel.petshop.entity.factories&& mvn archetype:generate -B -DarchetypeGroupId=com.dooapp -DarchetypeArtifactId=component-archetype -DgroupId=com.genmymodel -DartifactId=petshop-cart-component -Dversion=1.0-SNAPSHOT -DFileShortName=Cart -DJavaShortName=Cart -Dauthor=genmymodel -Dtime=`date +%s` -DDOMAIN=CART -DwrapperPackage=com.genmymodel.petshop.wrapper -DdomainPackage=com.genmymodel.petshop.entity -DbuilderPackage=com.genmymodel.petshop.entity.factories