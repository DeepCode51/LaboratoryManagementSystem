const base = {
    get() {
                return {
            url : "http://localhost:8080/springbootdtjr3/",
            name: "springbootdtjr3",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootdtjr3/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "实验室管理系统"
        } 
    }
}
export default base
