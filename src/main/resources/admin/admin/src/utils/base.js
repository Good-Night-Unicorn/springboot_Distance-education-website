const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootsagm21hd/",
            name: "springbootsagm21hd",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootsagm21hd/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "远程教育网站的设计与实现"
        } 
    }
}
export default base
