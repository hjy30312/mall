 $(function() {

                var defaultData = [
                //第一大类    商品管理
                    {
                        text: '商品管理',
                        href: '#parent1',
                        tags: ['4'],
                        nodes: [
                            {
                                text: '商品修改',
                                href: '#child1',
                                tags: ['2'],
                                nodes: [
                                    {
                                        text: '修改1',
                                        href: '#grandchild1',
                                        tags: ['0']
                                    },
                                    {
                                        text: '修改2',
                                        href: '#grandchild2',
                                        tags: ['0']
                                    }
                                ]
                            },
                            {
                                text: '商品分类',
                                href: '#child2',
                                tags: ['2'],
                                nodes: [
                                    {
                                        text: '分类1',
                                        href: '#grandchild1',
                                        tags: ['0']
                                    },
                                    {
                                        text: '分类2',
                                        href: '#grandchild2',
                                        tags: ['0']
                                    }
                                ]
                            }
                        ]
                    },
                    //********第二大类    订单管理
                    {
                    	text: '订单管理',
                        href: '#parent1',
                        tags: ['4'],
                        nodes: [
                                 {
	                                text: '订单修改',
	                                href: '#child1',
	                                tags: ['0']                         
                                 },
                                 {
	                                text: '订单添加',
	                                href: '#child1',
	                                tags: ['0']                         
                                 },
                                 {
	                                text: '订单删除',
	                                href: '#child1',
	                                tags: ['0']                         
                                 },
                                 {
	                                text: '订单查询',
	                                href: '#child1',
	                                tags: ['0']                         
                                 }
                        ]
                    
                    }
                ];
                $('#treeview1').treeview({
                    data: defaultData
                });
      

            });