package test;

public class homework {


	
		 /*
	      * ��1
	      * int�^�̔z��data���쐬���A�l��3,1,2,7,5�ŏ��������Ȃ���
	      */

		 
		 public static void main(String[] args) {
			int data[]= {3,1,2,7,5};
			
		
			
		        /*
		        * ��2
		        * �ȉ���for�������������Ȃ���
		        */
		        for(int i = 0; i < data.length; i++){
		            System.out.print(data[i] + " ");
		        }
		        
		        
		        //System.out.println();
		        
		        
		        for (int i = 0; i < data.length; i++) {
		            for (int j = i + 1; j < data.length ; j++) {
		                /*
		                * ��3
		                * �ȉ��A�z��̓Y�������ă\�[�g�����������Ȃ���
		                */
		                if(data[i] > data[j]){
		                  int box = data[i];
		                  data[i] = data[j];
		                  data[j] = box;
		                }
		            }
		        }
		        
		        System.out.println();
		     for(int i = 0; i < data.length; i++){
		        System.out.print(data[i] + " ");
		        }
		    }
		}