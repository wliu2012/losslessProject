/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package losslessproject;
import java.lang.System;
/**
 *
 * @author weijie
 */
public class LosslessProject {

    public static void AandBEncoder(int[][] tempOriginalImage, int[][] tempPredictorImage)
    {
        tempPredictorImage[0][0]=tempOriginalImage[0][0];
        for(int i=1; i<=15;i++)
        {
            tempPredictorImage[0][i]= tempOriginalImage[0][i]-tempOriginalImage[0][i-1];
            tempPredictorImage[i][0]= tempOriginalImage[i][0]-tempOriginalImage[i-1][0];
        }
    }
    
    public static void AandBDecoder(int[][] tempDecompressionImage, int[][] tempDecoderImage)
    {
        tempDecompressionImage[0][0]=tempDecoderImage[0][0];
        for(int i=1; i<=15;i++)
        {
            tempDecompressionImage[0][i]= tempDecoderImage[0][i]+tempDecompressionImage[0][i-1];
            tempDecompressionImage[i][0]= tempDecoderImage[i][0]+tempDecompressionImage[i-1][0];
        }
    }
    
    public static void firstEquationEncoder(int[][] tempOriginalImage, int[][] tempPredictorImage)
    {
       for(int i=1; i<=15;i++)
        {
            for(int j=1; j<=15;j++)
            {
                tempPredictorImage[j][i]= tempOriginalImage[j][i]-tempOriginalImage[j][i-1];
            }
        } 
    }
    
    public static void firstEquationDecoder(int[][] tempDecompressionImage, int[][] tempDecoderImage)
    {
       for(int i=1; i<=15;i++)
        {
            for(int j=1; j<=15;j++)
            {
                tempDecompressionImage[j][i]= tempDecoderImage[j][i]+tempDecompressionImage[j][i-1];
            }
        } 
    }
    
    public static void secondEquationEncoder(int[][] tempOriginalImage, int[][] tempPredictorImage)
    {
       for(int i=1; i<=15;i++)
        {
            for(int j=1; j<=15;j++)
            {
                tempPredictorImage[j][i]= tempOriginalImage[j][i]-tempOriginalImage[j-1][i];
            }
        } 
    }
        
    public static void secondEquationDecoder(int[][] tempDecompressionImage, int[][] tempDecoderImage)
    {
       for(int i=1; i<=15;i++)
        {
            for(int j=1; j<=15;j++)
            {
                tempDecompressionImage[j][i]= tempDecoderImage[j][i]+tempDecompressionImage[j-1][i];
            }
        } 
    }
    
    public static void thirdEquationEncoder(int[][] tempOriginalImage, int[][] tempPredictorImage)
    {
       for(int j=1; j<=15;j++)
        {
            for(int i=1; i<=15;i++)
            {
                tempPredictorImage[j][i]= tempOriginalImage[j][i]-tempOriginalImage[j-1][i-1];
            }
        } 
    }
    
     public static void thirdEquationDecoder(int[][] tempDecompressionImage, int[][] tempDecoderImage)
    {
       for(int i=1; i<=15;i++)
        {
            for(int j=1; j<=15;j++)
            {
                tempDecompressionImage[j][i]= tempDecoderImage[j][i]+tempDecompressionImage[j-1][i-1];
            }
        } 
    }
    
    public static void forthEquationEncoder(int[][] tempOriginalImage, int[][] tempPredictorImage)
    {
       for(int j=1; j<=15;j++)
        {
            for(int i=1; i<=15;i++)
            {
                tempPredictorImage[j][i]= tempOriginalImage[j][i]-tempOriginalImage[j][i-1]-tempOriginalImage[j-1][i]+tempOriginalImage[j-1][i-1];
            }
        } 
    }
    
    public static void forthEquationDecoder(int[][] tempDecompressionImage, int[][] tempDecoderImage)
    {
       for(int i=1; i<=15;i++)
        {
            for(int j=1; j<=15;j++)
            {
                tempDecompressionImage[j][i]= tempDecoderImage[j][i]+tempDecompressionImage[j][i-1]+tempDecompressionImage[j-1][i]-tempDecompressionImage[j-1][i-1];
            }
        } 
    } 
     
    public static void fifthEquationEncoder(int[][] tempOriginalImage, int[][] tempPredictorImage)
    {
       for(int j=1; j<=15;j++)
        {
            for(int i=1; i<=15;i++)
            {
                tempPredictorImage[j][i]= tempOriginalImage[j][i]-(tempOriginalImage[j][i-1]+(tempOriginalImage[j-1][i]-tempOriginalImage[j-1][i-1])/2);
            }
        } 
    }
    
    public static void fifthEquationDecoder(int[][] tempDecompressionImage, int[][] tempDecoderImage)
    {
       for(int i=1; i<=15;i++)
        {
            for(int j=1; j<=15;j++)
            {
                tempDecompressionImage[j][i]= tempDecoderImage[j][i]+(tempDecompressionImage[j][i-1]+(tempDecompressionImage[j-1][i]-tempDecompressionImage[j-1][i-1])/2);
            }
        } 
    } 
    
    public static void sixthEquationEncoder(int[][] tempOriginalImage, int[][] tempPredictorImage)
    {
       for(int j=1; j<=15;j++)
        {
            for(int i=1; i<=15;i++)
            {
                tempPredictorImage[j][i]= tempOriginalImage[j][i]-(tempOriginalImage[j-1][i]+(tempOriginalImage[j][i-1]-tempOriginalImage[j-1][i-1])/2);
            }
        } 
    }
    
    public static void sixthEquationDecoder(int[][] tempDecompressionImage, int[][] tempDecoderImage)
    {
       for(int i=1; i<=15;i++)
        {
            for(int j=1; j<=15;j++)
            {
                tempDecompressionImage[j][i]= tempDecoderImage[j][i]+(tempDecompressionImage[j-1][i]+(tempDecompressionImage[j][i-1]-tempDecompressionImage[j-1][i-1])/2);
            }
        } 
    } 
    
    public static void seventhEquationEncoder(int[][] tempOriginalImage, int[][] tempPredictorImage)
    {
       for(int j=1; j<=15;j++)
        {
            for(int i=1; i<=15;i++)
            {
                tempPredictorImage[j][i]= tempOriginalImage[j][i]-(tempOriginalImage[j][i-1]/2+tempOriginalImage[j-1][i]/2);
            }
        } 
    }
    
    public static void seventhEquationDecoder(int[][] tempDecompressionImage, int[][] tempDecoderImage)
    {
       for(int i=1; i<=15;i++)
        {
            for(int j=1; j<=15;j++)
            {
                tempDecompressionImage[j][i]= tempDecoderImage[j][i]+(tempDecompressionImage[j][i-1]/2+tempDecompressionImage[j-1][i]/2);
            }
        } 
    } 
    
    public static void huffmanCodeEncoder(int[][]tempPredictorImage, String[][] tempHuffmanCode)
    {       
        String tempCode="";
       
        for(int i=0;i<=15;i++)
        {
            for(int j=0;j<=15;j++)
            {               
                switch(tempPredictorImage[i][j])
                {
                    case 0:
                        tempCode="1";
                        break;
                    case 1:
                        tempCode="00";
                        break;
                    case -1:
                        tempCode="011";
                        break;        
                    case 2:
                        tempCode="0100";
                        break;
                    case -2:
                        tempCode="01011";
                        break;
                    case 3:
                        tempCode="010100";
                        break;
                    case -3:
                        tempCode="0101011";
                        break;
                    case 4:
                        tempCode="01010100";
                        break;
                    case -4:
                        tempCode="010101011";
                        break;
                    case 5:
                        tempCode="010101010";
                        break;
                    case -5:
                        tempCode="01010101011";
                        break;
                    case 6:
                        tempCode="010101010100";
                        break;
                    case -6:
                        tempCode="0101010101011";
                        break;
                    default:
                        tempCode= Integer.toBinaryString(tempPredictorImage[0][0]);
                }
                tempHuffmanCode[i][j]=tempCode;
            }
        }       
    }
    
    public static void huffmanCodeDecoder(int[][]tempDecoderImage, String[][] tempHuffmanCode)
    {       
        int tempCode=0;
       
        for(int i=0;i<=15;i++)
        {
            for(int j=0;j<=15;j++)
            {               
                switch(tempHuffmanCode[i][j])
                {
                    case "1":
                        tempCode=0;
                        break;
                    case "00":
                        tempCode=1;
                        break;
                    case "011":
                        tempCode=-1;
                        break;        
                    case "0100":
                        tempCode=2;
                        break;
                    case "01011":
                        tempCode=-2;
                        break;
                    case "010100":
                        tempCode=3;
                        break;
                    case "0101011":
                        tempCode=-3;
                        break;
                    case "01010100":
                        tempCode=4;
                        break;
                    case "010101011":
                        tempCode=-4;
                        break;
                    case "010101010":
                        tempCode=5;
                        break;
                    case "01010101011":
                        tempCode=-5;
                        break;
                    case "010101010100":
                        tempCode=6;
                        break;
                    case "0101010101011":
                        tempCode=-6;
                        break;
                    default:
                        tempCode= Integer.parseInt(tempHuffmanCode[0][0],2);
                }
                tempDecoderImage[i][j]=tempCode;
            }
        }        
    }
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int[][] originalImage = { 
       {88,88,88,89,90,91,92,93,94,95,93,95,96,98,97,94},
       {93,91,91,90,92,93,94,94,95,95,92,93,95,95,95,96},
       {95,95,95,95,96,97,94,96,97,96,98,97,98,99,95,97},
       {97,96,98,97,98,94,95,97,99,100,99,101,100,100,98,98},
       {99,100,97,99,100,100,98,98,100,101,100,99,101,102,99,100},
       {100,101,100,99,101,102,99,100,103,102,103,101,101,100,102,101},
       {100,102,103,101,101,100,102,103,103,105,104,104,103,104,104,103},
       {103,105,103,105,105,104,104,104,102,101,100,100,100,101,102,103},
       {104,104,105,105,105,104,104,106,102,103,101,101,102,101,102,102},
       {102,105,105,105,106,104,106,104,103,101,100,100,101,102,102,103},
       {102,105,105,105,106,104,106,104,103,101,100,100,101,102,102,103},
       {102,105,105,105,106,104,105,104,103,101,102,100,102,102,102,103},
       {104,105,106,105,106,104,106,103,103,102,100,100,101,102,102,103},
       {103,105,107,107,106,104,106,104,103,101,100,100,101,102,102,103},
       {103,105,106,108,106,104,106,105,103,101,101,100,101,103,102,105},
       {102,105,105,105,106,104,106,107,104,103,102,100,101,104,102,104}      
    };
       
        int[][] predictorImage =new int[16][16];
        String[][] compressedImage =new String[16][16];
        int[][] decoderImage =new int[16][16];
        int[][] decompressionImage =new int[16][16];

        //First equation
        AandBEncoder(originalImage,predictorImage);
        firstEquationEncoder(originalImage,predictorImage);
        huffmanCodeEncoder(predictorImage, compressedImage);
        huffmanCodeDecoder(decoderImage, compressedImage);
        AandBDecoder(decompressionImage, decoderImage);
        firstEquationDecoder(decompressionImage, decoderImage);
        
        //second equation
        AandBEncoder(originalImage,predictorImage);
        secondEquationEncoder(originalImage,predictorImage);
        huffmanCodeEncoder(predictorImage, compressedImage);
        huffmanCodeDecoder(decoderImage, compressedImage);
        AandBDecoder(decompressionImage, decoderImage);
        secondEquationDecoder(decompressionImage, decoderImage);
        
        //third equation
        AandBEncoder(originalImage,predictorImage);
        thirdEquationEncoder(originalImage,predictorImage);
        huffmanCodeEncoder(predictorImage, compressedImage);
        huffmanCodeDecoder(decoderImage, compressedImage);
        AandBDecoder(decompressionImage, decoderImage);
        thirdEquationDecoder(decompressionImage, decoderImage);
        
         //forth equation
        AandBEncoder(originalImage,predictorImage);
        forthEquationEncoder(originalImage,predictorImage);
        huffmanCodeEncoder(predictorImage, compressedImage);
        huffmanCodeDecoder(decoderImage, compressedImage);
        AandBDecoder(decompressionImage, decoderImage);
        forthEquationDecoder(decompressionImage, decoderImage);
               
        //fifth equation
        AandBEncoder(originalImage,predictorImage);
        fifthEquationEncoder(originalImage,predictorImage);
        huffmanCodeEncoder(predictorImage, compressedImage);
        huffmanCodeDecoder(decoderImage, compressedImage);
        AandBDecoder(decompressionImage, decoderImage);
        fifthEquationDecoder(decompressionImage, decoderImage);
               
        //sixth equation
        AandBEncoder(originalImage,predictorImage);
        sixthEquationEncoder(originalImage,predictorImage);
        huffmanCodeEncoder(predictorImage, compressedImage);
        huffmanCodeDecoder(decoderImage, compressedImage);
        AandBDecoder(decompressionImage, decoderImage);
        sixthEquationDecoder(decompressionImage, decoderImage);
        
        //seventh equation
        AandBEncoder(originalImage,predictorImage);
        seventhEquationEncoder(originalImage,predictorImage);
        huffmanCodeEncoder(predictorImage, compressedImage);
        huffmanCodeDecoder(decoderImage, compressedImage);
        AandBDecoder(decompressionImage, decoderImage);
        seventhEquationDecoder(decompressionImage, decoderImage);
        
        
        
        for(int[] tempNumber1:decompressionImage)
        {
            for(int tempNumber2:tempNumber1)
            {
                System.out.print(tempNumber2+" ");
            }
            System.out.println();
        }
         System.out.println();
         System.out.println();
        for(int[] tempNumber1:originalImage)
        {
            for(int tempNumber2:tempNumber1)
            {
                System.out.print(tempNumber2+" ");
            }
            System.out.println();
        }
        
       
    }
    
   
    
}
