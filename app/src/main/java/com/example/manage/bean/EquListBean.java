package com.example.manage.bean;

import java.io.Serializable;
import java.util.List;

public class EquListBean implements Serializable {

    /**
     * Result : [{"list":[{"message":"我有一只小狗我有一只小狗我有一只小狗我有一只小狗"},{"message":"我有一只小狗我有一只小狗我有一只小狗我有一只小狗"}],"title":"我有一只小狗"},{"list":[{"message":"我有一只小狗我有一只小狗我有一只小狗我有一只小狗"}],"title":"我有一只小狗"}]
     * StatusCode : 200
     * Success : true
     */

    private int StatusCode;
    private boolean Success;
    private List<ResultBean> Result;

    public int getStatusCode() {
        return StatusCode;
    }

    public void setStatusCode(int StatusCode) {
        this.StatusCode = StatusCode;
    }

    public boolean isSuccess() {
        return Success;
    }

    public void setSuccess(boolean Success) {
        this.Success = Success;
    }

    public List<ResultBean> getResult() {
        return Result;
    }

    public void setResult(List<ResultBean> Result) {
        this.Result = Result;
    }

    public static class ResultBean {

        public ResultBean(Boolean state, String title, List<ListBean> list) {
            this.state = state;
            this.title = title;
            this.list = list;
        }

        /**
         * list : [{"message":"我有一只小狗我有一只小狗我有一只小狗我有一只小狗"},{"message":"我有一只小狗我有一只小狗我有一只小狗我有一只小狗"}]
         * title : 我有一只小狗
         */


        private Boolean state;
        private String title;
        private List<ListBean> list;

        public Boolean getState() {
            return state;
        }

        public void setState(Boolean state) {
            this.state = state;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            public ListBean(String message) {
                this.message = message;
            }

            /**
             * message : 我有一只小狗我有一只小狗我有一只小狗我有一只小狗
             */


            private String message;

            public String getMessage() {
                return message;
            }

            public void setMessage(String message) {
                this.message = message;
            }
        }
    }
}
