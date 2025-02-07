<template>
<div class="home-preview" :style='{"width":"100%","margin":"10px auto 0","flexWrap":"wrap","display":"flex"}'>



		<!-- 关于我们 -->
		<div id="about" class="animate__animated" :style='{"padding":"30px 250px 0 10%","boxShadow":"0 1px 6px rgba(255, 255, 255, .3)","margin":"0 0 10px","alignItems":"flex-start","background":"#fff","flexDirection":"column","display":"flex","width":"50%","position":"relative","height":"auto","order":"2"}'>
		  <div :style='{"width":"100%","lineHeight":"1.5","fontSize":"26px","color":"#FE6917","textAlign":"left","fontWeight":"bold"}'>{{aboutUsDetail.title}}</div>
		  <div :style='{"width":"100%","margin":"0 0 10px","lineHeight":"1.5","fontSize":"22px","color":"#9E9E9E","textAlign":"left"}'>{{aboutUsDetail.subtitle}}</div>
		  <div :style='{"padding":"0 10px","top":"30px","flexDirection":"column","display":"flex","width":"250px","position":"absolute","right":"30px","height":"auto"}'>
		    <img :style='{"width":"100%","margin":"0 0 10px","objectFit":"cover","display":"block","height":"150px"}' :src="baseUrl + aboutUsDetail.picture1">
		    <img :style='{"width":"100%","margin":"0 0 10px","objectFit":"cover","display":"block","height":"150px"}' :src="baseUrl + aboutUsDetail.picture2">
		    <img :style='{"width":"100%","margin":"0","objectFit":"cover","display":"block","height":"150px"}' :src="baseUrl + aboutUsDetail.picture3">
		  </div>
		  <div :style='{"minHeight":"320px","padding":"0 40px 0 0","margin":"30px 0","overflow":"hidden","color":"rgb(102, 102, 102)","display":"-webkit-box","width":"100%","lineHeight":"2.5","fontSize":"16px","textOverflow":"ellipsis","-webkit-box-orient":"vertical","-webkit-line-clamp":"8"}' v-html="aboutUsDetail.content"></div>
		  <div :style='{"width":"285px","background":"url(http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg) 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
		  <div :style='{"width":"285px","background":"url(http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg) 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
		  <div :style='{"width":"285px","background":"url(http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg) 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
		  <div :style='{"width":"285px","background":"url(http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg) 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
		  <div :style='{"border":"0","margin":"10px 0","alignItems":"flex-start","textAlign":"center","display":"flex","justifyContent":"flex-start","background":"url(http://codegen.caihongy.cn/20240120/706c1f468433451fb0241fa5f91e6b45.png)","width":"150px","lineHeight":"22px","backgroundSize":"100% 100%","backgroundRepeat":"no-repeat","fontWeight":"bold","height":"44px"}' @click="toDetail('aboutusDetail',aboutUsDetail)">
		    <span :style='{"color":"#FE6917","fontSize":"15px"}'>查看更多</span>
		    <span class="icon iconfont icon-gengduo1" :style='{"color":"#FE6917","fontSize":"15px","display":"none"}'></span>
		  </div>
		</div>
		<!-- 关于我们 -->

		<!-- 系统简介 -->
		<div id="system" class="animate__animated" :style='{"padding":"30px 10% 0 30px","boxShadow":"none","margin":"0 0 10px","alignItems":"flex-end","background":"#fff","flexDirection":"column","display":"flex","width":"50%","position":"relative","height":"auto","order":"2"}'>
		  <div :style='{"width":"100%","lineHeight":"1.5","fontSize":"32px","color":"#FE6917","textAlign":"right"}'>{{systemIntroductionDetail.title}}</div>
		  <div :style='{"width":"100%","margin":"0 0 10px","lineHeight":"1.5","fontSize":"20px","color":"#9e9e9e","textAlign":"right"}'>{{systemIntroductionDetail.subtitle}}</div>
		  <div :style='{"padding":"0","margin":"-86px 0 0","alignItems":"flex-end","flexWrap":"wrap","display":"flex","width":"100%","height":"auto"}'>
		    <img :style='{"margin":"0","objectFit":"cover","flex":1,"display":"block","height":"340px"}' :src="baseUrl + systemIntroductionDetail.picture1">
		    <img :style='{"margin":"0","objectFit":"cover","flex":1,"display":"block","height":"210px"}' :src="baseUrl + systemIntroductionDetail.picture2">
		    <img :style='{"margin":"0","objectFit":"cover","flex":1,"display":"block","height":"140px"}' :src="baseUrl + systemIntroductionDetail.picture3">
		  </div>
		  <div :style='{"padding":"25px 10px 5px","boxShadow":"0px 4px 10px 0px rgba(0,0,0,0.3)","margin":"0 0 10px 0","color":"rgb(102, 102, 102)","display":"-webkit-box","minHeight":"126px","overflow":"hidden","background":"#fff","width":"100%","lineHeight":"2","fontSize":"16px","textOverflow":"ellipsis","-webkit-box-orient":"vertical","-webkit-line-clamp":"3"}' v-html="systemIntroductionDetail.content"></div>
		  <div :style='{"width":"285px","background":"url(http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg) 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
		  <div :style='{"width":"285px","background":"url(http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg) 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
		  <div :style='{"width":"285px","background":"url(http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg) 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
		  <div :style='{"width":"285px","background":"url(http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg) 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
		  <div :style='{"border":"0","margin":"10px auto","alignItems":"flex-start","textAlign":"center","display":"flex","right":"20%","justifyContent":"flex-start","top":"148px","background":"url(http://codegen.caihongy.cn/20240120/706c1f468433451fb0241fa5f91e6b45.png)","width":"150px","lineHeight":"22px","backgroundSize":"100% 100%","position":"absolute","backgroundRepeat":"no-repeat","height":"44px"}' @click="toDetail('systemintroDetail',systemIntroductionDetail)">
		    <span :style='{"color":"#FE6917","fontSize":"15px","fontWeight":"bold"}'>查看更多</span>
		    <span class="icon iconfont icon-gengduo1" :style='{"color":"#FE6917","fontSize":"12px","display":"none"}'></span>
		  </div>
		</div>
		<!-- 系统简介 -->
		
	<!-- 新闻资讯 -->
	<div id="animate_newsnews" class="news animate__animated" :style='{"width":"100%","padding":"0 10% 200px","margin":"0 0 10px","background":"url(http://codegen.caihongy.cn/20240120/e0601a9236dd43348b881a57451e3d84.png) center center/100% 100% no-repeat","order":"3"}'>
		<div v-if="false" class="idea newsIdea" :style='{"padding":"20px","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
			<div class="box1" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
			<div class="box2" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
			<div class="box3" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
			<div class="box4" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
			<div class="box5" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
			<div class="box6" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
			<div class="box7" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
			<div class="box8" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
			<div class="box9" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
			<div class="box10" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		</div>
		
		<div class="title" :style='{"width":"auto","margin":"10px auto","lineHeight":"80px","textAlign":"center","background":"none"}'>
			<span :style='{"color":"#3554A4","fontSize":"36px","fontWeight":"bold"}'>系统公告</span>
		</div>
		
			
			
			
			
			
			
			
			
			
			
		






		<div v-if="newsList.length" class="list list17 index-pv1" :style='{"width":"100%","padding":"10px","background":"none","justifyContent":"space-between","display":"flex","height":"auto"}'>
		  <div class="swiper" :style='{"width":"45%","background":"#fff","height":"auto"}'>
		    <div class="swiper-container newsSwiper17 new-list-17news">
		      <div class="swiper-wrapper">
				<template v-for="(item,index) in newsList">
		        <div v-if="index < 3" class="swiper-slide">
		          <div :style='{"width":"100%","position":"relative","height":"auto"}' @click="toDetail('newsDetail', item)">
		            <img :style='{"width":"100%","objectFit":"cover","display":"block","height":"400px"}' :src="baseUrl + item.picture">
		            <div :style='{"alignItems":"center","left":"0","flexWrap":"wrap","bottom":"0","background":"rgba(0,0,0,.6)","display":"flex","width":"100%","position":"absolute"}'>
		              <div :style='{"width":"100%","padding":"0 10px","lineHeight":"44px","fontSize":"18px","color":"#fff","order":"1"}'>{{item.title}}</div>
		              <div :style='{"padding":"0 10px 5px","order":"2"}'>
		                <span class="icon iconfont icon-shijian21" :style='{"margin":"0 2px 0 0","lineHeight":"1.5","fontSize":"12px","color":"#fff"}'></span>
		                <span :style='{"color":"#fff","lineHeight":"1.5","fontSize":"12px"}'>{{item.addtime}}</span>
		              </div>
		            </div>
		          </div>
		        </div>
				</template>
		      </div>
		      <!-- Add Pagination -->
		      <div class="swiper-pagination" :style='{"width":"100%","left":"0","textAlign":"right","bottom":"10px"}'></div>
		    </div>
		  </div>
		  <div class="right" :style='{"width":"53%","height":"auto"}'>
		    <div v-if="newsList.length > 3" :style='{"padding":"10px","margin":"0 0 20px 0","flexWrap":"wrap","background":"#3554A4","display":"flex","width":"100%","height":"120px"}' @click="toDetail('newsDetail', newsList[3])">
		      <div :style='{"whiteSpace":"nowrap","overflow":"hidden","color":"#fff","width":"100%","lineHeight":"1.5","fontSize":"20px","textOverflow":"ellipsis","fontWeight":"bold"}' class="name">{{newsList[3].title}}</div>
		      <div :style='{"whiteSpace":"nowrap","overflow":"hidden","color":"#fff","width":"100%","lineHeight":"1.5","fontSize":"16px","textOverflow":"ellipsis"}' class="desc">{{newsList[3].introduction}}</div>
		      <div :style='{"padding":"0 10px 0 0","display":"inline-block"}'>
		        <span class="icon iconfont icon-shijian21" :style='{"margin":"0 4px 0 0","lineHeight":"1.5","fontSize":"13px","color":"#fff"}'></span>
		        <span :style='{"color":"#fff","lineHeight":"1.5","fontSize":"13px"}'>{{newsList[3].addtime}}</span>
		      </div>
		      <div :style='{"padding":"0 10px 0 0","display":"inline-block"}'>
		        <span class="icon iconfont icon-geren16" :style='{"margin":"0 4px 0 0","lineHeight":"1.5","fontSize":"13px","color":"#fff"}'></span>
		        <span :style='{"color":"#fff","lineHeight":"1.5","fontSize":"13px"}'>{{newsList[3].name}}</span>
		      </div>
		      <div :style='{"padding":"0 10px 0 0","display":"inline-block"}'>
		        <span class="icon iconfont icon-zan10" :style='{"margin":"0 4px 0 0","lineHeight":"1.5","fontSize":"13px","color":"#fff"}'></span>
		        <span :style='{"color":"#fff","lineHeight":"1.5","fontSize":"13px"}'>{{newsList[3].thumbsupnum}}</span>
		      </div>
		      <div :style='{"padding":"0 10px 0 0","display":"inline-block"}'>
		        <span class="icon iconfont icon-shoucang10" :style='{"margin":"0 4px 0 0","lineHeight":"1.5","fontSize":"13px","color":"#fff"}'></span>
		        <span :style='{"color":"#fff","lineHeight":"1.5","fontSize":"13px"}'>{{newsList[3].storeupnum}}</span>
		      </div>
		      <div :style='{"padding":"0","display":"inline-block"}'>
		        <span class="icon iconfont icon-chakan9" :style='{"margin":"0 4px 0 0","lineHeight":"1.5","fontSize":"13px","color":"#fff"}'></span>
		        <span :style='{"color":"#fff","lineHeight":"1.5","fontSize":"13px"}'>{{newsList[3].clicknum}}</span>
		      </div>
		    </div>
		    <div class="list" :style='{"width":"100%","padding":"0","flexWrap":"wrap","background":"#fff","display":"flex","height":"260px"}'>
			  <template v-for="(item,index) in newsList">
		      <div v-if="index > 3" :style='{"border":"1px solid #D8D8D8","width":"100%","alignItems":"center","borderWidth":"0 0 1px","display":"flex","height":"auto"}' @click="toDetail('newsDetail', item)">
		        <div :style='{"width":"5px","margin":"0 6px","borderRadius":"0","background":"#FE6917","height":"60%"}'></div>
		        <div class="title">{{item.title}}</div>
		        <div :style='{"padding":"0 6px","fontWeight":"bold"}'>
		          <span class="icon iconfont icon-shijian21" :style='{"color":"#000","lineHeight":"44px","fontSize":"12px"}'></span>
		          <span :style='{"color":"#000","lineHeight":"44px","fontSize":"12px"}'>{{item.addtime}}</span>
		        </div>
		      </div>
			  </template>
		    </div>
		  </div>
		</div>





		<div @click="moreBtn('news')" :style='{"border":"0","margin":"30px auto ","alignItems":"flex-start","textAlign":"center","background":"url(http://codegen.caihongy.cn/20240120/3368c2853c2844e4b9e0ef8bb4e08b15.png)","display":"flex","width":"150px","lineHeight":"22px","backgroundSize":"100% 100%","backgroundRepeat":"no-repeat","justifyContent":"flex-start","height":"44px"}'>
			<span :style='{"color":"#3554A4","fontSize":"16px","fontWeight":"bold"}'>查看更多</span>
			<i :style='{"color":"#f5f5f5","fontSize":"12px","display":"none"}' class="icon iconfont icon-gengduo1"></i>
		</div>
		
		</div>
	<!-- 新闻资讯 -->


<!-- 商品推荐 -->
<div id="animate_recommendjiaoxueziliao" class="recommend animate__animated" :style='{"width":"100%","padding":"0 0 60px","margin":"0 0 10px","position":"relative","background":"#fff","order":"4"}'>
	<div v-if="false" class="idea recommendIdea" :style='{"padding":"20px","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
		<div class="box1" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box2" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box3" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box4" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box5" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box6" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box7" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box8" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box9" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box10" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
	</div>
	
    <div class="title" :style='{"padding":"0 15%","margin":"10px auto","textAlign":"left","background":"url(http://codegen.caihongy.cn/20240120/8de8e1ff4ad24f5f91e69c0521172ccc.png)","width":"100%","lineHeight":"180px","backgroundSize":"100% 100%","backgroundRepeat":"no-repeat","height":"130px"}'>
		<span :style='{"color":"#fff","fontSize":"32px"}'>教学资料推荐</span>
	</div>
	
	
	
	
	
	
	
	
	<!-- 样式七 -->
	<div class="list list7 index-pv1" :style='{"width":"100%","padding":"10px 10%","background":"#fff","justifyContent":"space-between","display":"flex","height":"auto"}'>
		<div v-if="jiaoxueziliaoRecommend.length>0" class="list-item animation-box" @click="toDetail('jiaoxueziliaoDetail', jiaoxueziliaoRecommend[0])" :style='{"width":"calc(25% - 10px)","margin":"0","position":"relative","height":"auto"}'>
			<img :style='{"objectFit":"cover","width":"100%","height":"720px"}' v-if="preHttp(jiaoxueziliaoRecommend[0].tupian)" :src="jiaoxueziliaoRecommend[0].tupian.split(',')[0]" alt="" />
			<img :style='{"objectFit":"cover","width":"100%","height":"720px"}' v-else :src="baseUrl + (jiaoxueziliaoRecommend[0].tupian?jiaoxueziliaoRecommend[0].tupian.split(',')[0]:'')" alt="" />
			<div class="title line1" :style='{"padding":"10px 0","left":"0","flexWrap":"wrap","bottom":"0","background":"rgba(53, 84, 164, 0.50)","display":"flex","width":"100%","position":"absolute"}'>
                <div :style='{"width":"100%","padding":"0 10px","lineHeight":"44px","fontSize":"18px","color":"#fff","order":"1"}'>{{jiaoxueziliaoRecommend[0].biaoti}}</div>
                <div :style='{"width":"100%","padding":"0 10px","lineHeight":"44px","fontSize":"18px","color":"#fff","order":"1"}'>{{jiaoxueziliaoRecommend[0].kechengleibie}}</div>
				<div :style='{"width":"100%","padding":"0 10px","order":"6"}'>
				  <span class="icon iconfont icon-shijian21" :style='{"margin":"0 4px 0 0","lineHeight":"2","fontSize":"13px","color":"#fff"}'></span>
				  <span class="text" :style='{"color":"#fff","lineHeight":"2","fontSize":"13px"}'>{{jiaoxueziliaoRecommend[0].addtime}}</span>
				</div>
				<div :style='{"width":"100%","padding":"0 10px","order":"5"}'>
				  <span class="icon iconfont icon-geren16" :style='{"margin":"0 4px 0 0","lineHeight":"2","fontSize":"13px","color":"#fff"}'></span>
				  <span class="text" :style='{"color":"#fff","lineHeight":"2","fontSize":"13px"}'>{{jiaoxueziliaoRecommend[0].jiaoshigonghao}}</span>
				</div>
				<div :style='{"padding":"0 10px","order":"3"}'>
				  <span class="icon iconfont icon-shoucang10" :style='{"margin":"0 4px 0 0","lineHeight":"2","fontSize":"13px","color":"#fff"}'></span>
				  <span class="text" :style='{"color":"#fff","lineHeight":"2","fontSize":"13px"}'>{{jiaoxueziliaoRecommend[0].storeupnum}}</span>
				</div>
				<div :style='{"padding":"0 10px","order":"4"}'>
				  <span class="icon iconfont icon-chakan9" :style='{"margin":"0 4px 0 0","lineHeight":"2","fontSize":"13px","color":"#fff"}'></span>
				  <span class="text" :style='{"color":"#fff","lineHeight":"2","fontSize":"13px"}'>{{jiaoxueziliaoRecommend[0].clicknum}}</span>
				</div>
            </div>
		</div>
		<div :style='{"width":"calc(25% - 10px)","margin":"0","height":"275px"}' class="list-body">
			<div v-if="jiaoxueziliaoRecommend.length>1" @click="toDetail('jiaoxueziliaoDetail', jiaoxueziliaoRecommend[1])" class="list-item animation-box" :style='{"width":"100%","margin":"0 0 20px","position":"relative","height":"auto"}'>
				<img :style='{"objectFit":"cover","width":"100%","height":"350px"}' v-if="preHttp(jiaoxueziliaoRecommend[1].tupian)" :src="jiaoxueziliaoRecommend[1].tupian.split(',')[0]" alt="" />
				<img :style='{"objectFit":"cover","width":"100%","height":"350px"}' v-else :src="baseUrl + (jiaoxueziliaoRecommend[1].tupian?jiaoxueziliaoRecommend[1].tupian.split(',')[0]:'')" alt="" />
				<div class="title line1" :style='{"padding":"10px 0","left":"0","flexWrap":"wrap","bottom":"0","background":"rgba(0,0,0,.5)","display":"flex","width":"100%","position":"absolute"}'>
                    <div :style='{"width":"100%","padding":"0 10px","lineHeight":"44px","fontSize":"18px","color":"#fff","order":"1"}'>{{jiaoxueziliaoRecommend[1].biaoti}}</div>
                    <div :style='{"width":"100%","padding":"0 10px","lineHeight":"44px","fontSize":"18px","color":"#fff","order":"1"}'>{{jiaoxueziliaoRecommend[1].kechengleibie}}</div>
					<div :style='{"width":"100%","padding":"0 10px","order":"6"}'>
					  <span class="icon iconfont icon-shijian21" :style='{"margin":"0 4px 0 0","lineHeight":"2","fontSize":"13px","color":"#fff"}'></span>
					  <span class="text" :style='{"color":"#fff","lineHeight":"2","fontSize":"13px"}'>{{jiaoxueziliaoRecommend[1].addtime}}</span>
					</div>
					<div :style='{"width":"100%","padding":"0 10px","order":"5"}'>
					  <span class="icon iconfont icon-geren16" :style='{"margin":"0 4px 0 0","lineHeight":"2","fontSize":"13px","color":"#fff"}'></span>
					  <span class="text" :style='{"color":"#fff","lineHeight":"2","fontSize":"13px"}'>{{jiaoxueziliaoRecommend[1].jiaoshigonghao}}</span>
					</div>
					<div :style='{"padding":"0 10px","order":"3"}'>
					  <span class="icon iconfont icon-shoucang10" :style='{"margin":"0 4px 0 0","lineHeight":"2","fontSize":"13px","color":"#fff"}'></span>
					  <span class="text" :style='{"color":"#fff","lineHeight":"2","fontSize":"13px"}'>{{jiaoxueziliaoRecommend[1].storeupnum}}</span>
					</div>
					<div :style='{"padding":"0 10px","order":"4"}'>
					  <span class="icon iconfont icon-chakan9" :style='{"margin":"0 4px 0 0","lineHeight":"2","fontSize":"13px","color":"#fff"}'></span>
					  <span class="text" :style='{"color":"#fff","lineHeight":"2","fontSize":"13px"}'>{{jiaoxueziliaoRecommend[1].clicknum}}</span>
					</div>
                </div>
			</div>
			<div v-if="jiaoxueziliaoRecommend.length>2" @click="toDetail('jiaoxueziliaoDetail', jiaoxueziliaoRecommend[2])" class="list-item animation-box" :style='{"width":"100%","margin":"0","position":"relative","height":"auto"}'>
				<img :style='{"objectFit":"cover","width":"100%","height":"350px"}' v-if="preHttp(jiaoxueziliaoRecommend[2].tupian)" :src="jiaoxueziliaoRecommend[2].tupian.split(',')[0]" alt="" />
				<img :style='{"objectFit":"cover","width":"100%","height":"350px"}' v-else :src="baseUrl +  (jiaoxueziliaoRecommend[2].tupian?jiaoxueziliaoRecommend[2].tupian.split(',')[0]:'')" alt="" />
				<div class="list-4-item-title line1" :style='{"padding":"10px 0","left":"0","flexWrap":"wrap","bottom":"0","background":"rgba(0,0,0,.5)","display":"flex","width":"100%","position":"absolute"}'>
                    <div :style='{"width":"100%","padding":"0 10px","lineHeight":"44px","fontSize":"18px","color":"#fff","order":"1"}'>{{jiaoxueziliaoRecommend[2].biaoti}}</div>
                    <div :style='{"width":"100%","padding":"0 10px","lineHeight":"44px","fontSize":"18px","color":"#fff","order":"1"}'>{{jiaoxueziliaoRecommend[2].kechengleibie}}</div>
					<div :style='{"width":"100%","padding":"0 10px","order":"6"}'>
					  <span class="icon iconfont icon-shijian21" :style='{"margin":"0 4px 0 0","lineHeight":"2","fontSize":"13px","color":"#fff"}'></span>
					  <span class="text" :style='{"color":"#fff","lineHeight":"2","fontSize":"13px"}'>{{jiaoxueziliaoRecommend[2].addtime}}</span>
					</div>
					<div :style='{"width":"100%","padding":"0 10px","order":"5"}'>
					  <span class="icon iconfont icon-geren16" :style='{"margin":"0 4px 0 0","lineHeight":"2","fontSize":"13px","color":"#fff"}'></span>
					  <span class="text" :style='{"color":"#fff","lineHeight":"2","fontSize":"13px"}'>{{jiaoxueziliaoRecommend[2].jiaoshigonghao}}</span>
					</div>
					<div :style='{"padding":"0 10px","order":"3"}'>
					  <span class="icon iconfont icon-shoucang10" :style='{"margin":"0 4px 0 0","lineHeight":"2","fontSize":"13px","color":"#fff"}'></span>
					  <span class="text" :style='{"color":"#fff","lineHeight":"2","fontSize":"13px"}'>{{jiaoxueziliaoRecommend[2].storeupnum}}</span>
					</div>
					<div :style='{"padding":"0 10px","order":"4"}'>
					  <span class="icon iconfont icon-chakan9" :style='{"margin":"0 4px 0 0","lineHeight":"2","fontSize":"13px","color":"#fff"}'></span>
					  <span class="text" :style='{"color":"#fff","lineHeight":"2","fontSize":"13px"}'>{{jiaoxueziliaoRecommend[2].clicknum}}</span>
					</div>
                </div>
			</div>
		</div>
		<div v-if="jiaoxueziliaoRecommend.length>3" class="list-item animation-box" @click="toDetail('jiaoxueziliaoDetail', jiaoxueziliaoRecommend[3])" :style='{"width":"calc(25% - 10px)","margin":"0","position":"relative","height":"auto"}'>
			<img :style='{"objectFit":"cover","width":"100%","height":"720px"}' v-if="preHttp(jiaoxueziliaoRecommend[3].tupian)" :src="jiaoxueziliaoRecommend[3].tupian.split(',')[0]" alt="" />
			<img :style='{"objectFit":"cover","width":"100%","height":"720px"}' v-else :src="baseUrl + (jiaoxueziliaoRecommend[3].tupian?jiaoxueziliaoRecommend[3].tupian.split(',')[0]:'')" alt="" />
			<div class="list-4-item-title line1" :style='{"padding":"10px 0","left":"0","flexWrap":"wrap","bottom":"0","background":"rgba(53, 84, 164, 0.50)","display":"flex","width":"100%","position":"absolute"}'>
                <div :style='{"width":"100%","padding":"0 10px","lineHeight":"44px","fontSize":"18px","color":"#fff","order":"1"}'>{{jiaoxueziliaoRecommend[3].biaoti}}</div>
                <div :style='{"width":"100%","padding":"0 10px","lineHeight":"44px","fontSize":"18px","color":"#fff","order":"1"}'>{{jiaoxueziliaoRecommend[3].kechengleibie}}</div>
				<div :style='{"width":"100%","padding":"0 10px","order":"6"}'>
				  <span class="icon iconfont icon-shijian21" :style='{"margin":"0 4px 0 0","lineHeight":"2","fontSize":"13px","color":"#fff"}'></span>
				  <span class="text" :style='{"color":"#fff","lineHeight":"2","fontSize":"13px"}'>{{jiaoxueziliaoRecommend[3].addtime}}</span>
				</div>
				<div :style='{"width":"100%","padding":"0 10px","order":"5"}'>
				  <span class="icon iconfont icon-geren16" :style='{"margin":"0 4px 0 0","lineHeight":"2","fontSize":"13px","color":"#fff"}'></span>
				  <span class="text" :style='{"color":"#fff","lineHeight":"2","fontSize":"13px"}'>{{jiaoxueziliaoRecommend[3].jiaoshigonghao}}</span>
				</div>
				<div :style='{"padding":"0 10px","order":"3"}'>
				  <span class="icon iconfont icon-shoucang10" :style='{"margin":"0 4px 0 0","lineHeight":"2","fontSize":"13px","color":"#fff"}'></span>
				  <span class="text" :style='{"color":"#fff","lineHeight":"2","fontSize":"13px"}'>{{jiaoxueziliaoRecommend[3].storeupnum}}</span>
				</div>
				<div :style='{"padding":"0 10px","order":"4"}'>
				  <span class="icon iconfont icon-chakan9" :style='{"margin":"0 4px 0 0","lineHeight":"2","fontSize":"13px","color":"#fff"}'></span>
				  <span class="text" :style='{"color":"#fff","lineHeight":"2","fontSize":"13px"}'>{{jiaoxueziliaoRecommend[3].clicknum}}</span>
				</div>
            </div>
		</div>
		<div :style='{"width":"calc(25% - 10px)","margin":"0","height":"auto"}' class="list-body">
			<div v-if="jiaoxueziliaoRecommend.length>4" @click="toDetail('jiaoxueziliaoDetail', jiaoxueziliaoRecommend[4])" class="list-item animation-box" :style='{"width":"100%","margin":"0","position":"relative","height":"auto"}'>
				<img :style='{"objectFit":"cover","width":"100%","height":"350px"}' v-if="preHttp(jiaoxueziliaoRecommend[4].tupian)" :src="jiaoxueziliaoRecommend[4].tupian.split(',')[0]" alt="" />
				<img :style='{"objectFit":"cover","width":"100%","height":"350px"}' v-else :src="baseUrl + (jiaoxueziliaoRecommend[4].tupian?jiaoxueziliaoRecommend[4].tupian.split(',')[0]:'')" alt="" />
				<div class="title line1" :style='{"padding":"10px 0","left":"0","flexWrap":"wrap","bottom":"0","background":"rgba(0,0,0,.5)","display":"flex","width":"100%","position":"absolute"}'>
                    <div :style='{"width":"100%","padding":"0 10px","lineHeight":"44px","fontSize":"18px","color":"#fff","order":"1"}'>{{jiaoxueziliaoRecommend[4].biaoti}}</div>
                    <div :style='{"width":"100%","padding":"0 10px","lineHeight":"44px","fontSize":"18px","color":"#fff","order":"1"}'>{{jiaoxueziliaoRecommend[4].kechengleibie}}</div>
					<div :style='{"width":"100%","padding":"0 10px","order":"6"}'>
					  <span class="icon iconfont icon-shijian21" :style='{"margin":"0 4px 0 0","lineHeight":"2","fontSize":"13px","color":"#fff"}'></span>
					  <span class="text" :style='{"color":"#fff","lineHeight":"2","fontSize":"13px"}'>{{jiaoxueziliaoRecommend[4].addtime}}</span>
					</div>
					<div :style='{"width":"100%","padding":"0 10px","order":"5"}'>
					  <span class="icon iconfont icon-geren16" :style='{"margin":"0 4px 0 0","lineHeight":"2","fontSize":"13px","color":"#fff"}'></span>
					  <span class="text" :style='{"color":"#fff","lineHeight":"2","fontSize":"13px"}'>{{jiaoxueziliaoRecommend[4].jiaoshigonghao}}</span>
					</div>
					<div :style='{"padding":"0 10px","order":"3"}'>
					  <span class="icon iconfont icon-shoucang10" :style='{"margin":"0 4px 0 0","lineHeight":"2","fontSize":"13px","color":"#fff"}'></span>
					  <span class="text" :style='{"color":"#fff","lineHeight":"2","fontSize":"13px"}'>{{jiaoxueziliaoRecommend[4].storeupnum}}</span>
					</div>
					<div :style='{"padding":"0 10px","order":"4"}'>
					  <span class="icon iconfont icon-chakan9" :style='{"margin":"0 4px 0 0","lineHeight":"2","fontSize":"13px","color":"#fff"}'></span>
					  <span class="text" :style='{"color":"#fff","lineHeight":"2","fontSize":"13px"}'>{{jiaoxueziliaoRecommend[4].clicknum}}</span>
					</div>
                </div>
			</div>
			<div v-if="jiaoxueziliaoRecommend.length>5" @click="toDetail('jiaoxueziliaoDetail', jiaoxueziliaoRecommend[5])" class="list-item animation-box" :style='{"width":"100%","margin":"20px 0 0","position":"relative","height":"auto"}'>
				<img :style='{"objectFit":"cover","width":"100%","height":"350px"}' v-if="preHttp(jiaoxueziliaoRecommend[5].tupian)" :src="jiaoxueziliaoRecommend[5].tupian.split(',')[0]" alt="" />
				<img :style='{"objectFit":"cover","width":"100%","height":"350px"}' v-else :src="baseUrl + (jiaoxueziliaoRecommend[5].tupian?jiaoxueziliaoRecommend[5].tupian.split(',')[0]:'')" alt="" />
				<div class="title line1" :style='{"padding":"10px 0","left":"0","flexWrap":"wrap","bottom":"0","background":"rgba(0,0,0,.5)","display":"flex","width":"100%","position":"absolute"}'>
                    <div :style='{"width":"100%","padding":"0 10px","lineHeight":"44px","fontSize":"18px","color":"#fff","order":"1"}'>{{jiaoxueziliaoRecommend[5].biaoti}}</div>
                    <div :style='{"width":"100%","padding":"0 10px","lineHeight":"44px","fontSize":"18px","color":"#fff","order":"1"}'>{{jiaoxueziliaoRecommend[5].kechengleibie}}</div>
					<div :style='{"width":"100%","padding":"0 10px","order":"6"}'>
					  <span class="icon iconfont icon-shijian21" :style='{"margin":"0 4px 0 0","lineHeight":"2","fontSize":"13px","color":"#fff"}'></span>
					  <span class="text" :style='{"color":"#fff","lineHeight":"2","fontSize":"13px"}'>{{jiaoxueziliaoRecommend[5].addtime}}</span>
					</div>
					<div :style='{"width":"100%","padding":"0 10px","order":"5"}'>
					  <span class="icon iconfont icon-geren16" :style='{"margin":"0 4px 0 0","lineHeight":"2","fontSize":"13px","color":"#fff"}'></span>
					  <span class="text" :style='{"color":"#fff","lineHeight":"2","fontSize":"13px"}'>{{jiaoxueziliaoRecommend[5].jiaoshigonghao}}</span>
					</div>
					<div :style='{"padding":"0 10px","order":"3"}'>
					  <span class="icon iconfont icon-shoucang10" :style='{"margin":"0 4px 0 0","lineHeight":"2","fontSize":"13px","color":"#fff"}'></span>
					  <span class="text" :style='{"color":"#fff","lineHeight":"2","fontSize":"13px"}'>{{jiaoxueziliaoRecommend[5].storeupnum}}</span>
					</div>
					<div :style='{"padding":"0 10px","order":"4"}'>
					  <span class="icon iconfont icon-chakan9" :style='{"margin":"0 4px 0 0","lineHeight":"2","fontSize":"13px","color":"#fff"}'></span>
					  <span class="text" :style='{"color":"#fff","lineHeight":"2","fontSize":"13px"}'>{{jiaoxueziliaoRecommend[5].clicknum}}</span>
					</div>
                </div>
			</div>
		</div>
	</div>
	
	







	
	<div @click="moreBtn('jiaoxueziliao')" :style='{"border":"0","margin":"10px auto","alignItems":"flex-start","textAlign":"center","display":"flex","right":"10%","justifyContent":"flex-start","top":"40px","background":"url(http://codegen.caihongy.cn/20240120/5899f099ae314fe8a3862732fa777e4c.png) center center/100% 100% no-repeat","width":"150px","lineHeight":"22px","position":"absolute","height":"44px"}'>
		<span :style='{"color":"#fff","fontSize":"16px","fontWeight":"bold"}'>查看更多</span>
		<i :style='{"color":"#f5f5f5","fontSize":"12px","display":"none"}' class="icon iconfont icon-gengduo1"></i>
	</div>
	
</div>
<!-- 商品推荐 -->

<!-- 商品推荐 -->
<div id="animate_recommendjiaoxueshipin" class="recommend animate__animated" :style='{"width":"100%","padding":"0 0 60px","margin":"0 0 10px","position":"relative","background":"#fff","order":"4"}'>
	<div v-if="false" class="idea recommendIdea" :style='{"padding":"20px","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
		<div class="box1" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box2" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box3" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box4" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box5" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box6" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box7" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box8" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box9" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box10" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
	</div>
	
    <div class="title" :style='{"padding":"0 15%","margin":"10px auto","textAlign":"left","background":"url(http://codegen.caihongy.cn/20240120/8de8e1ff4ad24f5f91e69c0521172ccc.png)","width":"100%","lineHeight":"180px","backgroundSize":"100% 100%","backgroundRepeat":"no-repeat","height":"130px"}'>
		<span :style='{"color":"#fff","fontSize":"32px"}'>教学视频推荐</span>
	</div>
	
	
	
	
	
	
	
	
	<!-- 样式七 -->
	<div class="list list7 index-pv1" :style='{"width":"100%","padding":"10px 10%","background":"#fff","justifyContent":"space-between","display":"flex","height":"auto"}'>
		<div v-if="jiaoxueshipinRecommend.length>0" class="list-item animation-box" @click="toDetail('jiaoxueshipinDetail', jiaoxueshipinRecommend[0])" :style='{"width":"calc(25% - 10px)","margin":"0","position":"relative","height":"auto"}'>
			<img :style='{"objectFit":"cover","width":"100%","height":"720px"}' v-if="preHttp(jiaoxueshipinRecommend[0].fengmian)" :src="jiaoxueshipinRecommend[0].fengmian.split(',')[0]" alt="" />
			<img :style='{"objectFit":"cover","width":"100%","height":"720px"}' v-else :src="baseUrl + (jiaoxueshipinRecommend[0].fengmian?jiaoxueshipinRecommend[0].fengmian.split(',')[0]:'')" alt="" />
			<div class="title line1" :style='{"padding":"10px 0","left":"0","flexWrap":"wrap","bottom":"0","background":"rgba(53, 84, 164, 0.50)","display":"flex","width":"100%","position":"absolute"}'>
                <div :style='{"width":"100%","padding":"0 10px","lineHeight":"44px","fontSize":"18px","color":"#fff","order":"1"}'>{{jiaoxueshipinRecommend[0].biaoti}}</div>
                <div :style='{"width":"100%","padding":"0 10px","lineHeight":"44px","fontSize":"18px","color":"#fff","order":"1"}'>{{jiaoxueshipinRecommend[0].kechengleibie}}</div>
				<div :style='{"width":"100%","padding":"0 10px","order":"6"}'>
				  <span class="icon iconfont icon-shijian21" :style='{"margin":"0 4px 0 0","lineHeight":"2","fontSize":"13px","color":"#fff"}'></span>
				  <span class="text" :style='{"color":"#fff","lineHeight":"2","fontSize":"13px"}'>{{jiaoxueshipinRecommend[0].addtime}}</span>
				</div>
				<div :style='{"width":"100%","padding":"0 10px","order":"5"}'>
				  <span class="icon iconfont icon-geren16" :style='{"margin":"0 4px 0 0","lineHeight":"2","fontSize":"13px","color":"#fff"}'></span>
				  <span class="text" :style='{"color":"#fff","lineHeight":"2","fontSize":"13px"}'>{{jiaoxueshipinRecommend[0].jiaoshigonghao}}</span>
				</div>
				<div :style='{"padding":"0 10px","order":"3"}'>
				  <span class="icon iconfont icon-shoucang10" :style='{"margin":"0 4px 0 0","lineHeight":"2","fontSize":"13px","color":"#fff"}'></span>
				  <span class="text" :style='{"color":"#fff","lineHeight":"2","fontSize":"13px"}'>{{jiaoxueshipinRecommend[0].storeupnum}}</span>
				</div>
				<div :style='{"padding":"0 10px","order":"4"}'>
				  <span class="icon iconfont icon-chakan9" :style='{"margin":"0 4px 0 0","lineHeight":"2","fontSize":"13px","color":"#fff"}'></span>
				  <span class="text" :style='{"color":"#fff","lineHeight":"2","fontSize":"13px"}'>{{jiaoxueshipinRecommend[0].clicknum}}</span>
				</div>
            </div>
		</div>
		<div :style='{"width":"calc(25% - 10px)","margin":"0","height":"275px"}' class="list-body">
			<div v-if="jiaoxueshipinRecommend.length>1" @click="toDetail('jiaoxueshipinDetail', jiaoxueshipinRecommend[1])" class="list-item animation-box" :style='{"width":"100%","margin":"0 0 20px","position":"relative","height":"auto"}'>
				<img :style='{"objectFit":"cover","width":"100%","height":"350px"}' v-if="preHttp(jiaoxueshipinRecommend[1].fengmian)" :src="jiaoxueshipinRecommend[1].fengmian.split(',')[0]" alt="" />
				<img :style='{"objectFit":"cover","width":"100%","height":"350px"}' v-else :src="baseUrl + (jiaoxueshipinRecommend[1].fengmian?jiaoxueshipinRecommend[1].fengmian.split(',')[0]:'')" alt="" />
				<div class="title line1" :style='{"padding":"10px 0","left":"0","flexWrap":"wrap","bottom":"0","background":"rgba(0,0,0,.5)","display":"flex","width":"100%","position":"absolute"}'>
                    <div :style='{"width":"100%","padding":"0 10px","lineHeight":"44px","fontSize":"18px","color":"#fff","order":"1"}'>{{jiaoxueshipinRecommend[1].biaoti}}</div>
                    <div :style='{"width":"100%","padding":"0 10px","lineHeight":"44px","fontSize":"18px","color":"#fff","order":"1"}'>{{jiaoxueshipinRecommend[1].kechengleibie}}</div>
					<div :style='{"width":"100%","padding":"0 10px","order":"6"}'>
					  <span class="icon iconfont icon-shijian21" :style='{"margin":"0 4px 0 0","lineHeight":"2","fontSize":"13px","color":"#fff"}'></span>
					  <span class="text" :style='{"color":"#fff","lineHeight":"2","fontSize":"13px"}'>{{jiaoxueshipinRecommend[1].addtime}}</span>
					</div>
					<div :style='{"width":"100%","padding":"0 10px","order":"5"}'>
					  <span class="icon iconfont icon-geren16" :style='{"margin":"0 4px 0 0","lineHeight":"2","fontSize":"13px","color":"#fff"}'></span>
					  <span class="text" :style='{"color":"#fff","lineHeight":"2","fontSize":"13px"}'>{{jiaoxueshipinRecommend[1].jiaoshigonghao}}</span>
					</div>
					<div :style='{"padding":"0 10px","order":"3"}'>
					  <span class="icon iconfont icon-shoucang10" :style='{"margin":"0 4px 0 0","lineHeight":"2","fontSize":"13px","color":"#fff"}'></span>
					  <span class="text" :style='{"color":"#fff","lineHeight":"2","fontSize":"13px"}'>{{jiaoxueshipinRecommend[1].storeupnum}}</span>
					</div>
					<div :style='{"padding":"0 10px","order":"4"}'>
					  <span class="icon iconfont icon-chakan9" :style='{"margin":"0 4px 0 0","lineHeight":"2","fontSize":"13px","color":"#fff"}'></span>
					  <span class="text" :style='{"color":"#fff","lineHeight":"2","fontSize":"13px"}'>{{jiaoxueshipinRecommend[1].clicknum}}</span>
					</div>
                </div>
			</div>
			<div v-if="jiaoxueshipinRecommend.length>2" @click="toDetail('jiaoxueshipinDetail', jiaoxueshipinRecommend[2])" class="list-item animation-box" :style='{"width":"100%","margin":"0","position":"relative","height":"auto"}'>
				<img :style='{"objectFit":"cover","width":"100%","height":"350px"}' v-if="preHttp(jiaoxueshipinRecommend[2].fengmian)" :src="jiaoxueshipinRecommend[2].fengmian.split(',')[0]" alt="" />
				<img :style='{"objectFit":"cover","width":"100%","height":"350px"}' v-else :src="baseUrl +  (jiaoxueshipinRecommend[2].fengmian?jiaoxueshipinRecommend[2].fengmian.split(',')[0]:'')" alt="" />
				<div class="list-4-item-title line1" :style='{"padding":"10px 0","left":"0","flexWrap":"wrap","bottom":"0","background":"rgba(0,0,0,.5)","display":"flex","width":"100%","position":"absolute"}'>
                    <div :style='{"width":"100%","padding":"0 10px","lineHeight":"44px","fontSize":"18px","color":"#fff","order":"1"}'>{{jiaoxueshipinRecommend[2].biaoti}}</div>
                    <div :style='{"width":"100%","padding":"0 10px","lineHeight":"44px","fontSize":"18px","color":"#fff","order":"1"}'>{{jiaoxueshipinRecommend[2].kechengleibie}}</div>
					<div :style='{"width":"100%","padding":"0 10px","order":"6"}'>
					  <span class="icon iconfont icon-shijian21" :style='{"margin":"0 4px 0 0","lineHeight":"2","fontSize":"13px","color":"#fff"}'></span>
					  <span class="text" :style='{"color":"#fff","lineHeight":"2","fontSize":"13px"}'>{{jiaoxueshipinRecommend[2].addtime}}</span>
					</div>
					<div :style='{"width":"100%","padding":"0 10px","order":"5"}'>
					  <span class="icon iconfont icon-geren16" :style='{"margin":"0 4px 0 0","lineHeight":"2","fontSize":"13px","color":"#fff"}'></span>
					  <span class="text" :style='{"color":"#fff","lineHeight":"2","fontSize":"13px"}'>{{jiaoxueshipinRecommend[2].jiaoshigonghao}}</span>
					</div>
					<div :style='{"padding":"0 10px","order":"3"}'>
					  <span class="icon iconfont icon-shoucang10" :style='{"margin":"0 4px 0 0","lineHeight":"2","fontSize":"13px","color":"#fff"}'></span>
					  <span class="text" :style='{"color":"#fff","lineHeight":"2","fontSize":"13px"}'>{{jiaoxueshipinRecommend[2].storeupnum}}</span>
					</div>
					<div :style='{"padding":"0 10px","order":"4"}'>
					  <span class="icon iconfont icon-chakan9" :style='{"margin":"0 4px 0 0","lineHeight":"2","fontSize":"13px","color":"#fff"}'></span>
					  <span class="text" :style='{"color":"#fff","lineHeight":"2","fontSize":"13px"}'>{{jiaoxueshipinRecommend[2].clicknum}}</span>
					</div>
                </div>
			</div>
		</div>
		<div v-if="jiaoxueshipinRecommend.length>3" class="list-item animation-box" @click="toDetail('jiaoxueshipinDetail', jiaoxueshipinRecommend[3])" :style='{"width":"calc(25% - 10px)","margin":"0","position":"relative","height":"auto"}'>
			<img :style='{"objectFit":"cover","width":"100%","height":"720px"}' v-if="preHttp(jiaoxueshipinRecommend[3].fengmian)" :src="jiaoxueshipinRecommend[3].fengmian.split(',')[0]" alt="" />
			<img :style='{"objectFit":"cover","width":"100%","height":"720px"}' v-else :src="baseUrl + (jiaoxueshipinRecommend[3].fengmian?jiaoxueshipinRecommend[3].fengmian.split(',')[0]:'')" alt="" />
			<div class="list-4-item-title line1" :style='{"padding":"10px 0","left":"0","flexWrap":"wrap","bottom":"0","background":"rgba(53, 84, 164, 0.50)","display":"flex","width":"100%","position":"absolute"}'>
                <div :style='{"width":"100%","padding":"0 10px","lineHeight":"44px","fontSize":"18px","color":"#fff","order":"1"}'>{{jiaoxueshipinRecommend[3].biaoti}}</div>
                <div :style='{"width":"100%","padding":"0 10px","lineHeight":"44px","fontSize":"18px","color":"#fff","order":"1"}'>{{jiaoxueshipinRecommend[3].kechengleibie}}</div>
				<div :style='{"width":"100%","padding":"0 10px","order":"6"}'>
				  <span class="icon iconfont icon-shijian21" :style='{"margin":"0 4px 0 0","lineHeight":"2","fontSize":"13px","color":"#fff"}'></span>
				  <span class="text" :style='{"color":"#fff","lineHeight":"2","fontSize":"13px"}'>{{jiaoxueshipinRecommend[3].addtime}}</span>
				</div>
				<div :style='{"width":"100%","padding":"0 10px","order":"5"}'>
				  <span class="icon iconfont icon-geren16" :style='{"margin":"0 4px 0 0","lineHeight":"2","fontSize":"13px","color":"#fff"}'></span>
				  <span class="text" :style='{"color":"#fff","lineHeight":"2","fontSize":"13px"}'>{{jiaoxueshipinRecommend[3].jiaoshigonghao}}</span>
				</div>
				<div :style='{"padding":"0 10px","order":"3"}'>
				  <span class="icon iconfont icon-shoucang10" :style='{"margin":"0 4px 0 0","lineHeight":"2","fontSize":"13px","color":"#fff"}'></span>
				  <span class="text" :style='{"color":"#fff","lineHeight":"2","fontSize":"13px"}'>{{jiaoxueshipinRecommend[3].storeupnum}}</span>
				</div>
				<div :style='{"padding":"0 10px","order":"4"}'>
				  <span class="icon iconfont icon-chakan9" :style='{"margin":"0 4px 0 0","lineHeight":"2","fontSize":"13px","color":"#fff"}'></span>
				  <span class="text" :style='{"color":"#fff","lineHeight":"2","fontSize":"13px"}'>{{jiaoxueshipinRecommend[3].clicknum}}</span>
				</div>
            </div>
		</div>
		<div :style='{"width":"calc(25% - 10px)","margin":"0","height":"auto"}' class="list-body">
			<div v-if="jiaoxueshipinRecommend.length>4" @click="toDetail('jiaoxueshipinDetail', jiaoxueshipinRecommend[4])" class="list-item animation-box" :style='{"width":"100%","margin":"0","position":"relative","height":"auto"}'>
				<img :style='{"objectFit":"cover","width":"100%","height":"350px"}' v-if="preHttp(jiaoxueshipinRecommend[4].fengmian)" :src="jiaoxueshipinRecommend[4].fengmian.split(',')[0]" alt="" />
				<img :style='{"objectFit":"cover","width":"100%","height":"350px"}' v-else :src="baseUrl + (jiaoxueshipinRecommend[4].fengmian?jiaoxueshipinRecommend[4].fengmian.split(',')[0]:'')" alt="" />
				<div class="title line1" :style='{"padding":"10px 0","left":"0","flexWrap":"wrap","bottom":"0","background":"rgba(0,0,0,.5)","display":"flex","width":"100%","position":"absolute"}'>
                    <div :style='{"width":"100%","padding":"0 10px","lineHeight":"44px","fontSize":"18px","color":"#fff","order":"1"}'>{{jiaoxueshipinRecommend[4].biaoti}}</div>
                    <div :style='{"width":"100%","padding":"0 10px","lineHeight":"44px","fontSize":"18px","color":"#fff","order":"1"}'>{{jiaoxueshipinRecommend[4].kechengleibie}}</div>
					<div :style='{"width":"100%","padding":"0 10px","order":"6"}'>
					  <span class="icon iconfont icon-shijian21" :style='{"margin":"0 4px 0 0","lineHeight":"2","fontSize":"13px","color":"#fff"}'></span>
					  <span class="text" :style='{"color":"#fff","lineHeight":"2","fontSize":"13px"}'>{{jiaoxueshipinRecommend[4].addtime}}</span>
					</div>
					<div :style='{"width":"100%","padding":"0 10px","order":"5"}'>
					  <span class="icon iconfont icon-geren16" :style='{"margin":"0 4px 0 0","lineHeight":"2","fontSize":"13px","color":"#fff"}'></span>
					  <span class="text" :style='{"color":"#fff","lineHeight":"2","fontSize":"13px"}'>{{jiaoxueshipinRecommend[4].jiaoshigonghao}}</span>
					</div>
					<div :style='{"padding":"0 10px","order":"3"}'>
					  <span class="icon iconfont icon-shoucang10" :style='{"margin":"0 4px 0 0","lineHeight":"2","fontSize":"13px","color":"#fff"}'></span>
					  <span class="text" :style='{"color":"#fff","lineHeight":"2","fontSize":"13px"}'>{{jiaoxueshipinRecommend[4].storeupnum}}</span>
					</div>
					<div :style='{"padding":"0 10px","order":"4"}'>
					  <span class="icon iconfont icon-chakan9" :style='{"margin":"0 4px 0 0","lineHeight":"2","fontSize":"13px","color":"#fff"}'></span>
					  <span class="text" :style='{"color":"#fff","lineHeight":"2","fontSize":"13px"}'>{{jiaoxueshipinRecommend[4].clicknum}}</span>
					</div>
                </div>
			</div>
			<div v-if="jiaoxueshipinRecommend.length>5" @click="toDetail('jiaoxueshipinDetail', jiaoxueshipinRecommend[5])" class="list-item animation-box" :style='{"width":"100%","margin":"20px 0 0","position":"relative","height":"auto"}'>
				<img :style='{"objectFit":"cover","width":"100%","height":"350px"}' v-if="preHttp(jiaoxueshipinRecommend[5].fengmian)" :src="jiaoxueshipinRecommend[5].fengmian.split(',')[0]" alt="" />
				<img :style='{"objectFit":"cover","width":"100%","height":"350px"}' v-else :src="baseUrl + (jiaoxueshipinRecommend[5].fengmian?jiaoxueshipinRecommend[5].fengmian.split(',')[0]:'')" alt="" />
				<div class="title line1" :style='{"padding":"10px 0","left":"0","flexWrap":"wrap","bottom":"0","background":"rgba(0,0,0,.5)","display":"flex","width":"100%","position":"absolute"}'>
                    <div :style='{"width":"100%","padding":"0 10px","lineHeight":"44px","fontSize":"18px","color":"#fff","order":"1"}'>{{jiaoxueshipinRecommend[5].biaoti}}</div>
                    <div :style='{"width":"100%","padding":"0 10px","lineHeight":"44px","fontSize":"18px","color":"#fff","order":"1"}'>{{jiaoxueshipinRecommend[5].kechengleibie}}</div>
					<div :style='{"width":"100%","padding":"0 10px","order":"6"}'>
					  <span class="icon iconfont icon-shijian21" :style='{"margin":"0 4px 0 0","lineHeight":"2","fontSize":"13px","color":"#fff"}'></span>
					  <span class="text" :style='{"color":"#fff","lineHeight":"2","fontSize":"13px"}'>{{jiaoxueshipinRecommend[5].addtime}}</span>
					</div>
					<div :style='{"width":"100%","padding":"0 10px","order":"5"}'>
					  <span class="icon iconfont icon-geren16" :style='{"margin":"0 4px 0 0","lineHeight":"2","fontSize":"13px","color":"#fff"}'></span>
					  <span class="text" :style='{"color":"#fff","lineHeight":"2","fontSize":"13px"}'>{{jiaoxueshipinRecommend[5].jiaoshigonghao}}</span>
					</div>
					<div :style='{"padding":"0 10px","order":"3"}'>
					  <span class="icon iconfont icon-shoucang10" :style='{"margin":"0 4px 0 0","lineHeight":"2","fontSize":"13px","color":"#fff"}'></span>
					  <span class="text" :style='{"color":"#fff","lineHeight":"2","fontSize":"13px"}'>{{jiaoxueshipinRecommend[5].storeupnum}}</span>
					</div>
					<div :style='{"padding":"0 10px","order":"4"}'>
					  <span class="icon iconfont icon-chakan9" :style='{"margin":"0 4px 0 0","lineHeight":"2","fontSize":"13px","color":"#fff"}'></span>
					  <span class="text" :style='{"color":"#fff","lineHeight":"2","fontSize":"13px"}'>{{jiaoxueshipinRecommend[5].clicknum}}</span>
					</div>
                </div>
			</div>
		</div>
	</div>
	
	







	
	<div @click="moreBtn('jiaoxueshipin')" :style='{"border":"0","margin":"10px auto","alignItems":"flex-start","textAlign":"center","display":"flex","right":"10%","justifyContent":"flex-start","top":"40px","background":"url(http://codegen.caihongy.cn/20240120/5899f099ae314fe8a3862732fa777e4c.png) center center/100% 100% no-repeat","width":"150px","lineHeight":"22px","position":"absolute","height":"44px"}'>
		<span :style='{"color":"#fff","fontSize":"16px","fontWeight":"bold"}'>查看更多</span>
		<i :style='{"color":"#f5f5f5","fontSize":"12px","display":"none"}' class="icon iconfont icon-gengduo1"></i>
	</div>
	
</div>
<!-- 商品推荐 -->


<!-- 特价商品 -->
<div id="animate_listjiaoxueshipin" class="lists animate__animated" :style='{"width":"100%","margin":"0 0 10px","position":"relative","background":"#fff","order":"5"}'>
	<div v-if="false" class="idea" :style='{"padding":"20px","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
		<div class="box1" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box2" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box3" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box4" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box5" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box6" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box7" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box8" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box9" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box10" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
	</div>
	
	<div class="title" :style='{"padding":"0 40px","margin":"10px auto","borderRadius":"0 0 20px 20px","textAlign":"left","background":"#3554A4","width":"50%","lineHeight":"130px","height":"130px"}'>
	  <span :style='{"color":"#fff","fontSize":"32px"}'>教学视频展示</span>
	</div>
	
	
	
	
	
	
	
	
	
	





	<div v-if="jiaoxueshipinList.length" class="list list14 index-pv1" :style='{"width":"100%","padding":"10px 10% 50px","background":"#fff","justifyContent":"space-between","display":"flex","height":"auto"}'>
	  <div :style='{"width":"480px","position":"relative","height":"auto"}' class="left">
	    <img :style='{"width":"100% ","objectFit":"cover","display":"block","height":"590px"}' src="http://codegen.caihongy.cn/20230814/797fe92c8ce14417a09161c42381f9b3.jpg">
	    <template v-for="item,index in jiaoxueshipinList">
		<template v-if="listIndex14jiaoxueshipin == index">
		<img @click="toDetail('jiaoxueshipinDetail', item)" :name="item.id" :style='{"objectFit":"cover","top":"70px","left":"96px","display":"block","width":"88% ","position":"absolute","height":"560px"}' v-if="preHttp(item.fengmian)" :src="item.fengmian.split(',')[0]" alt="" />
		<img @click="toDetail('jiaoxueshipinDetail', item)" :name="item.id" :style='{"objectFit":"cover","top":"70px","left":"96px","display":"block","width":"88% ","position":"absolute","height":"560px"}' v-else :src="baseUrl + (item.fengmian?item.fengmian.split(',')[0]:'')" alt="" />
		</template>
		</template>
	  </div>
	  <div :style='{"width":"calc(100% - 500px)","padding":"50px 10px 0 50px","flexWrap":"wrap","justifyContent":"space-between","display":"flex","height":"auto"}' class="list">
	    <template v-for="item,index in jiaoxueshipinList">
		<img @click="listClick14(index, 'jiaoxueshipin')" :name="item.id" :style='{"width":"31% ","objectFit":"cover","display":"block","height":"250px"}' v-if="preHttp(item.fengmian)" :src="item.fengmian.split(',')[0]" alt="" />
		<img @click="listClick14(index, 'jiaoxueshipin')" :name="item.id" :style='{"width":"31% ","objectFit":"cover","display":"block","height":"250px"}' v-else :src="baseUrl + (item.fengmian?item.fengmian.split(',')[0]:'')" alt="" />
		</template>
	  </div>
	</div>

	
	
	<div @click="moreBtn('jiaoxueshipin')" :style='{"border":"0","margin":"0","top":"50px","textAlign":"center","background":"url(http://codegen.caihongy.cn/20240120/5899f099ae314fe8a3862732fa777e4c.png) center center/100% 100% no-repeat","display":"flex","width":"150px","lineHeight":"22px","position":"absolute","right":"calc(25% + 40px)","height":"44px"}'>
		<span :style='{"color":"#fff","fontSize":"16px"}'>查看更多</span>
		<i :style='{"color":"#f5f5f5","fontSize":"12px","display":"none"}' class="icon iconfont icon-gengduo1"></i>
	</div>
	

</div>
<!-- 特价商品 -->
	
</div>
</template>

<script>
import 'animate.css'
import Swiper from "swiper";

  export default {
    //数据集合
    data() {
      return {
        baseUrl: '',
        aboutUsDetail: {},
        systemIntroductionDetail: {},
        newsList: [],
        jiaoxueziliaoRecommend: [],
        jiaoxueshipinRecommend: [],

        jiaoxueshipinList: [],

		newListSwiper17news: null,


		listIndex14jiaoxueshipin: 0,

      }
    },
    created() {
		this.baseUrl = this.$config.baseUrl;
		this.getNewsList();
		this.getAboutUs();
		this.getSystemIntroduction();
		this.getList();
    },
	mounted() {
		window.addEventListener('scroll', this.handleScroll)
		setTimeout(()=>{
			this.handleScroll()
		},100)
		
		this.swiperChanges()
	},
	beforeDestroy() {
	  window.removeEventListener('scroll', this.handleScroll)
	},
    //方法集合
    methods: {
		swiperChanges() {
			if (this['newListSwiper17news']) this['newListSwiper17news'].destroy()
			setTimeout(()=>{
				this['newListSwiper17news'] = new Swiper(".new-list-17news", {"pagination":{"el":".swiper-pagination","clickable":true}})
			},750)
		},

		listClick14(index, name) {
			this['listIndex14' + name] = index
		},

		handleScroll() {
			let arr = [
				{id:'search',css:'animate__backInUp'},
				{id:'about',css:'animate__bounceInLeft'},
				{id:'system',css:'animate__bounceInRight'},
				{id:'animate_recommendjiaoxueziliao',css:'animate__fadeInUp'},
				{id:'animate_recommendjiaoxueshipin',css:'animate__fadeInUp'},
				{id:'animate_listjiaoxueshipin',css:'animate__fadeInUp'},
				{id:'animate_newsnews',css:'animate__fadeInUp'},
				{id:'msgs',css:'animate__fadeInUp'},
				{id:'friendly',css:'animate__fadeInUp'}
			]
			
			for (let i in arr) {
				let doc = document.getElementById(arr[i].id)
				if (doc) {
					let top = doc.offsetTop
					let win_top = window.innerHeight + window.pageYOffset
					// console.log(top,win_top)
					if (win_top > top && doc.classList.value.indexOf(arr[i].css) < 0) {
						// console.log(doc)
						doc.classList.add(arr[i].css)
					}
				}
			}
		},
      preHttp(str) {
          return str && str.substr(0,4)=='http';
      },
      getAboutUs() {
          this.$http.get('aboutus/detail/1', {}).then(res => {
            if(res.data.code == 0) {
              this.aboutUsDetail = res.data.data;
            }
          })
      },
      getSystemIntroduction() {
          this.$http.get('systemintro/detail/1', {}).then(res => {
            if(res.data.code == 0) {
              this.systemIntroductionDetail = res.data.data;
            }
          })
      },
		getNewsList() {
			let data = {
				page: 1,
				limit: 8,
                sort: 'addtime',
				order: 'desc'
			}
			this.$http.get('news/list', {params: data}).then(res => {
				if (res.data.code == 0) {
					this.newsList = res.data.data.list;
					
					
				}
			});
		},
		getList() {
			let autoSortUrl = "";
			let data = {}
          autoSortUrl = "jiaoxueziliao/autoSort";
          if(localStorage.getItem('frontToken')) {
              autoSortUrl = "jiaoxueziliao/autoSort2";
          }
			data = {
				page: 1,
				limit: 6,
			}
			this.$http.get(autoSortUrl, {params: data}).then(res => {
				if (res.data.code == 0) {
					this.jiaoxueziliaoRecommend = res.data.data.list;
					
					
					// 商品列表样式五
					
				}
			});
          autoSortUrl = "jiaoxueshipin/autoSort";
          if(localStorage.getItem('frontToken')) {
              autoSortUrl = "jiaoxueshipin/autoSort2";
          }
			data = {
				page: 1,
				limit: 6,
			}
			this.$http.get(autoSortUrl, {params: data}).then(res => {
				if (res.data.code == 0) {
					this.jiaoxueshipinRecommend = res.data.data.list;
					
					
					// 商品列表样式五
					
				}
			});
			
			data = {
				page: 1,
				limit: 6,
			}
			data['sort'] = 'fabushijian'
			data['order']= 'desc'
			this.$http.get('jiaoxueshipin/list', {params: data}).then(res => {
				if (res.data.code == 0) {
					this.jiaoxueshipinList = res.data.data.list;
					
					// 商品列表样式五
					
				}
			});
		},
		toDetail(path, item) {
			this.$router.push({path: '/index/' + path, query: {id: item.id}});
		},
		moreBtn(path) {
			this.$router.push({path: '/index/' + path});
		}
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.home-preview {
		// -------- search --------
		.search .select /deep/ .el-input__inner {
			border: 1px solid #000;
			border-radius: 0;
			padding: 0 30px 0 10px;
			box-shadow: none;
			color: #000;
			width: 180px;
			font-size: 16px;
			border-width: 0 0px 0 0;
			height: 44px;
		}
		
		.search .input /deep/ .el-input__inner {
			border: 0;
			border-radius: 4px;
			padding: 0 10px;
			box-shadow: none;
			outline: none;
			color: #000;
			width: 100%;
			font-size: 16px;
			height: 44px;
		}
		// -------- search --------
		.recommend {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list5 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
        }
        
        .list5 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list5 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 {
				.swiper-slide-prev {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-next {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-active {
					position: relative;
					z-index: 5;
				}
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 10px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				transform: rotate(0deg) scale(1.1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
		
		.news {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list6 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list6 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list6 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list6 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 10px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				transform: rotate(0deg) scale(1.1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
	
		.lists {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
        }
        
        .list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list5 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-next {
            left: auto;
            right: 10px;
			}
			
			.list5 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 {
				.swiper-slide-prev {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-next {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-active {
					position: relative;
					z-index: 5;
				}
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 10px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				transform: rotate(0deg) scale(1.1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
	}
	



	.home-preview .news .list17 .newsSwiper17 .swiper-pagination /deep/ span.swiper-pagination-bullet {
				border-radius: 100%;
				margin: 0 4px;
				background: #fff;
				display: inline-block;
				width: 10px;
				opacity: .2;
				height: 10px;
			}
	
	.home-preview .news .list17 .newsSwiper17 .swiper-pagination /deep/ span.swiper-pagination-bullet:hover {
				background: #3554A4;
				opacity: 1;
			}
	
	.home-preview .news .list17 .newsSwiper17 .swiper-pagination /deep/ span.swiper-pagination-bullet.swiper-pagination-bullet-active {
				background: #3554A4;
				opacity: 1;
			}
	
	.home-preview .news .list17 .right .list .title {
				color: #000;
				flex: 1;
				font-weight: bold;
				font-size: 16px;
				line-height: 44px;
				transition: 0.3s;
			}
	
	.home-preview .news .list17 .right .list .title:hover {
				transform: translate3d(10px, 0px, 0px);
			}







</style>
