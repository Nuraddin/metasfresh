

-- 2018-11-06T16:06:54.317
-- I forgot to set the DICTIONARY_ID_COMMENTS System Configurator
/* DDL */ CREATE TABLE public.AD_Element_Link (AD_Client_ID NUMERIC(10) NOT NULL, AD_Element_ID NUMERIC(10), AD_Element_Link_ID NUMERIC(10) NOT NULL, AD_Org_ID NUMERIC(10) NOT NULL, AD_Window_ID NUMERIC(10), Created TIMESTAMP WITH TIME ZONE NOT NULL, CreatedBy NUMERIC(10) NOT NULL, IsActive CHAR(1) CHECK (IsActive IN ('Y','N')) NOT NULL, Updated TIMESTAMP WITH TIME ZONE NOT NULL, UpdatedBy NUMERIC(10) NOT NULL, CONSTRAINT ADElement_ADElementLink FOREIGN KEY (AD_Element_ID) REFERENCES public.AD_Element DEFERRABLE INITIALLY DEFERRED, CONSTRAINT AD_Element_Link_Key PRIMARY KEY (AD_Element_Link_ID), CONSTRAINT ADWindow_ADElementLink FOREIGN KEY (AD_Window_ID) REFERENCES public.AD_Window DEFERRABLE INITIALLY DEFERRED)
;

