import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Forum from '../pages/forum/list'
import ForumAdd from '../pages/forum/add'
import ForumDetail from '../pages/forum/detail'
import MyForumList from '../pages/forum/myForumList'
import ExamPaper from '../pages/exam/examPaper'
import Exam from '../pages/exam/exam'
import ExamList from '../pages/exam/examList'
import ExamRecord from '../pages/exam/examRecord'
import Storeup from '../pages/storeup/list'
import News from '../pages/news/news-list'
import NewsDetail from '../pages/news/news-detail'
import payList from '../pages/pay'

import jiaoshiList from '../pages/jiaoshi/list'
import jiaoshiDetail from '../pages/jiaoshi/detail'
import jiaoshiAdd from '../pages/jiaoshi/add'
import xueshengList from '../pages/xuesheng/list'
import xueshengDetail from '../pages/xuesheng/detail'
import xueshengAdd from '../pages/xuesheng/add'
import jiaoxueziliaoList from '../pages/jiaoxueziliao/list'
import jiaoxueziliaoDetail from '../pages/jiaoxueziliao/detail'
import jiaoxueziliaoAdd from '../pages/jiaoxueziliao/add'
import jiaoxueshipinList from '../pages/jiaoxueshipin/list'
import jiaoxueshipinDetail from '../pages/jiaoxueshipin/detail'
import jiaoxueshipinAdd from '../pages/jiaoxueshipin/add'
import kechengleibieList from '../pages/kechengleibie/list'
import kechengleibieDetail from '../pages/kechengleibie/detail'
import kechengleibieAdd from '../pages/kechengleibie/add'
import kechengzuoyeList from '../pages/kechengzuoye/list'
import kechengzuoyeDetail from '../pages/kechengzuoye/detail'
import kechengzuoyeAdd from '../pages/kechengzuoye/add'
import zuoyetijiaoList from '../pages/zuoyetijiao/list'
import zuoyetijiaoDetail from '../pages/zuoyetijiao/detail'
import zuoyetijiaoAdd from '../pages/zuoyetijiao/add'
import zuoyepigaiList from '../pages/zuoyepigai/list'
import zuoyepigaiDetail from '../pages/zuoyepigai/detail'
import zuoyepigaiAdd from '../pages/zuoyepigai/add'
import newstypeList from '../pages/newstype/list'
import newstypeDetail from '../pages/newstype/detail'
import newstypeAdd from '../pages/newstype/add'
import aboutusList from '../pages/aboutus/list'
import aboutusDetail from '../pages/aboutus/detail'
import aboutusAdd from '../pages/aboutus/add'
import systemintroList from '../pages/systemintro/list'
import systemintroDetail from '../pages/systemintro/detail'
import systemintroAdd from '../pages/systemintro/add'
import discussjiaoxueziliaoList from '../pages/discussjiaoxueziliao/list'
import discussjiaoxueziliaoDetail from '../pages/discussjiaoxueziliao/detail'
import discussjiaoxueziliaoAdd from '../pages/discussjiaoxueziliao/add'
import discussjiaoxueshipinList from '../pages/discussjiaoxueshipin/list'
import discussjiaoxueshipinDetail from '../pages/discussjiaoxueshipin/detail'
import discussjiaoxueshipinAdd from '../pages/discussjiaoxueshipin/add'
import discusskechengzuoyeList from '../pages/discusskechengzuoye/list'
import discusskechengzuoyeDetail from '../pages/discusskechengzuoye/detail'
import discusskechengzuoyeAdd from '../pages/discusskechengzuoye/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'pay',
					component: payList,
				},
				{
					path: 'forum',
					component: Forum
				},
				{
					path: 'forumAdd',
					component: ForumAdd
				},
				{
					path: 'forumDetail',
					component: ForumDetail
				},
				{
					path: 'myForumList',
					component: MyForumList
				},
				{
					path: 'examPaper',
					component: ExamPaper
				},
				{
					path: 'examList',
					component:ExamList
				},
				{
					path: 'examRecord/:type',
					component:ExamRecord
				},
				{
					path: 'storeup',
					component: Storeup
				},
				{
					path: 'news',
					component: News
				},
				{
					path: 'newsDetail',
					component: NewsDetail
				},
				{
					path: 'jiaoshi',
					component: jiaoshiList
				},
				{
					path: 'jiaoshiDetail',
					component: jiaoshiDetail
				},
				{
					path: 'jiaoshiAdd',
					component: jiaoshiAdd
				},
				{
					path: 'xuesheng',
					component: xueshengList
				},
				{
					path: 'xueshengDetail',
					component: xueshengDetail
				},
				{
					path: 'xueshengAdd',
					component: xueshengAdd
				},
				{
					path: 'jiaoxueziliao',
					component: jiaoxueziliaoList
				},
				{
					path: 'jiaoxueziliaoDetail',
					component: jiaoxueziliaoDetail
				},
				{
					path: 'jiaoxueziliaoAdd',
					component: jiaoxueziliaoAdd
				},
				{
					path: 'jiaoxueshipin',
					component: jiaoxueshipinList
				},
				{
					path: 'jiaoxueshipinDetail',
					component: jiaoxueshipinDetail
				},
				{
					path: 'jiaoxueshipinAdd',
					component: jiaoxueshipinAdd
				},
				{
					path: 'kechengleibie',
					component: kechengleibieList
				},
				{
					path: 'kechengleibieDetail',
					component: kechengleibieDetail
				},
				{
					path: 'kechengleibieAdd',
					component: kechengleibieAdd
				},
				{
					path: 'kechengzuoye',
					component: kechengzuoyeList
				},
				{
					path: 'kechengzuoyeDetail',
					component: kechengzuoyeDetail
				},
				{
					path: 'kechengzuoyeAdd',
					component: kechengzuoyeAdd
				},
				{
					path: 'zuoyetijiao',
					component: zuoyetijiaoList
				},
				{
					path: 'zuoyetijiaoDetail',
					component: zuoyetijiaoDetail
				},
				{
					path: 'zuoyetijiaoAdd',
					component: zuoyetijiaoAdd
				},
				{
					path: 'zuoyepigai',
					component: zuoyepigaiList
				},
				{
					path: 'zuoyepigaiDetail',
					component: zuoyepigaiDetail
				},
				{
					path: 'zuoyepigaiAdd',
					component: zuoyepigaiAdd
				},
				{
					path: 'newstype',
					component: newstypeList
				},
				{
					path: 'newstypeDetail',
					component: newstypeDetail
				},
				{
					path: 'newstypeAdd',
					component: newstypeAdd
				},
				{
					path: 'aboutus',
					component: aboutusList
				},
				{
					path: 'aboutusDetail',
					component: aboutusDetail
				},
				{
					path: 'aboutusAdd',
					component: aboutusAdd
				},
				{
					path: 'systemintro',
					component: systemintroList
				},
				{
					path: 'systemintroDetail',
					component: systemintroDetail
				},
				{
					path: 'systemintroAdd',
					component: systemintroAdd
				},
				{
					path: 'discussjiaoxueziliao',
					component: discussjiaoxueziliaoList
				},
				{
					path: 'discussjiaoxueziliaoDetail',
					component: discussjiaoxueziliaoDetail
				},
				{
					path: 'discussjiaoxueziliaoAdd',
					component: discussjiaoxueziliaoAdd
				},
				{
					path: 'discussjiaoxueshipin',
					component: discussjiaoxueshipinList
				},
				{
					path: 'discussjiaoxueshipinDetail',
					component: discussjiaoxueshipinDetail
				},
				{
					path: 'discussjiaoxueshipinAdd',
					component: discussjiaoxueshipinAdd
				},
				{
					path: 'discusskechengzuoye',
					component: discusskechengzuoyeList
				},
				{
					path: 'discusskechengzuoyeDetail',
					component: discusskechengzuoyeDetail
				},
				{
					path: 'discusskechengzuoyeAdd',
					component: discusskechengzuoyeAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
		{
			path: '/exam',
			component: Exam
		}
	]
})
